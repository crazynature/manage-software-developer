/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3q3;

/**
 *
 * @author cjrjh
 */
public class BitVector implements IBitVector {

    private int  bit[];
    private int sizeOfBit = 0;

   
    public BitVector() {
        bit = new int[100];
    }
    
        public BitVector(int i) {
           bit = new int[i]; 
    }
    
    /**
     * /* Determine if the bit at position i is set.
     */
    public boolean get(int i) {
        int order = i / 32;
        int index = i - (32 * order);
        if(order>this.bit.length)
            return false;
        
        
        String result = Integer.toBinaryString(bit[order]);
        while(result.length()<32){
            result="0"+result;
        }

        if (result.charAt(31-index)=='1') {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Set the bit at position i.
     */
    public void set(int i) {
        if(!this.get(i)){
      
        int order = i / 32;
        int index = i - (32 * order);
        if(index==31){
             index = (int) Math.pow(2, index)+1;
        }else
        {
        index = (int) Math.pow(2, index);
        }
        if(order>this.bit.length){
          BitVector temp = new BitVector(order+1);
          
          temp.copy(this);
  
          temp.bit[order]= (int) (temp.bit[order]+index);
          temp.sizeOfBit++;
          this.copy(temp);
          
        }
        else{
            
        this.sizeOfBit++;
        this.bit[order]= (int) (this.bit[order]+index);

        }
        }

    }

    /**
     * Clear the bit at position i.
     */
    public void clear(int i) {
        this.sizeOfBit--;
        int order = i / 32;
        int index = i - (32 * order);
        index = (int) Math.pow(2, index);
        this.bit[order] = (int) (bit[order] - index);
    }

    /**
     * Set the bits in the argument BitVector b.
     */
    public void copy(BitVector b) {
        if (this.bit.length < b.bit.length) {
            this.bit = new int[b.bit.length];
        }
        else{
            for (int i = b.bit.length; i < this.bit.length; i++) {
            this.bit[i] = 0;
           
        }
        }

        this.sizeOfBit = b.sizeOfBit;
        for (int i = 0; i < b.bit.length; i++) {
            this.bit[i] = b.bit[i];
           
        }
        
    }

    /**
     * Determine the number of non-zero bits in the BitVector.
     */
    public int size() {
        return this.sizeOfBit;
    }

    /**
     * Iterator over the Integer values represented by this BitVector.
     *
     * @return
     */
    @Override
    public Iterator<Integer> iterator() {
        
        int index = 0;
       Integer data[]= new Integer[this.sizeOfBit];
       for (int i = 0;i<this.bit.length;i++){
           String result = Integer.toBinaryString(bit[i]);
        while(result.length()<32){
            result="0"+result;
        }
        
        for(int j =31; j >= 0;j--){
            if(result.charAt(j)=='1'){
                data[index]=i*32+(31-j);
                
                index++;
                
            }
        }
    }

        Iterator<Integer> temp = new ArrayInterator<>(data);
        return temp;

    }

}
