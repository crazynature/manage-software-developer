/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3q1;

/**
 *
 * @author cjrjh
 */
public class HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BitVector x = new BitVector();
         BitVector y = new BitVector();
        x.set(0);
         System.out.println(x.get(0));
        y.copy(x);
 System.out.println(y.get(0));

  //     System.out.println(x.size()); 
        x.set(31);
        x.set(43);
          System.out.println(x.get(31));
           System.out.println(x.get(0));
    //      System.out.println(x.size()); 
          x.clear(43);
       //   System.out.println(x.size()); 
          System.out.println(x.get(43));
          x.set(320000);
      //    System.out.println(x.size()); 
           System.out.println(x.get(320000));
           System.out.println(x.get(31));
          
            Iterator<Integer> temp = x.iterator();
      //   System.out.println(temp.nextElement());
     
     while(temp.hasAnotherElement()){
         System.out.println(temp.nextElement()+" ");
       }
//        
    }
    
}
