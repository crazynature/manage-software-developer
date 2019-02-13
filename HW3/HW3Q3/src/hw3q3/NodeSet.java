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
public class NodeSet implements Set<Node> {
   Node data;
   private int size = 0;
   private IBitVector adaptee = new BitVector();
@Override 
public void add(Node n){
 int id = n.getId();
 adaptee.set(id);
    data.data.put(id,n);
//if(size< data.length){
//    data[size]= n;
//    size++;
//}
//else
//{
//    Node temp[] = new Node[size+size];
//    for(int i =0;i<size;i++){
//        temp[i]=data[i];
//    }
//    temp[size]=n;
//    size++;
//    data = temp;
//}
}

@Override 
public void addAll(Set<Node> n){ 
    Iterator<Node> temp = n.iterator();
       while(temp.hasAnotherElement()){
       this.add(temp.nextElement());
       }
       }


 @Override 
 public void remove(Node n){
int id  = n.getId();

adaptee.clear(id);
 data.data.remove(id,n);
//int record= 0;
//Node temp;
//for(int i =0;i<size;i++){
//    if(data[i].getId()==id){
//        record = i;
//        break;
//    }
//}
//if(record == size){
//    data[size]=null;
//    size--;
//}
//else{
//for(int i = record;i<size;i++){
//    data[i]=data[i+1];
//}
//data[size]=null;
//size--;
//}
 }
 
 @Override public boolean contains(Node n) { 
 int id  = n.getId();
 return adaptee.get(id);

//for(int i =0;i<size;i++){
//    if(data[i].getId()==id){
//        
//        return true;
//    }
//}
//return false;
 }
 
 
 @Override public int size(){ 
return adaptee.size();
 }
@Override public Iterator<Node> iterator(){
     Node tempData[] = new Node[this.adaptee.size()]; 
int i =0;
  Iterator<Integer> temp  = this.adaptee.iterator();
  while(temp.hasAnotherElement()){
      tempData[i]=data.getNode(temp.nextElement());
      i++;
  }
Iterator<Node> result = new ArrayInterator(tempData);

return result;
}
 @Override public String toString(){ 
           Iterator<Node> temp = this.iterator();
      //   System.out.println(temp.nextElement());
     String result = "";
     while(temp.hasAnotherElement()){
         if(result.equals("")){
             result = temp.nextElement().textualRepresentation();
         }
         else{
         result = result +". "+temp.nextElement().textualRepresentation();
         }
       }
 return result;
 }

}