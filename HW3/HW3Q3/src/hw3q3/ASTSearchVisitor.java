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
public  class ASTSearchVisitor implements ASTVisitor{

    @Override
    public String searchVisitor(Assignment n){
        return n.getVar().getName();
    };
    @Override
    public String searchVisitor(Declaration n){
        return n.getVar().getName();
    }

    public NodeSet search(NodeSet n, Variable target) {
        Node current;
        NodeSet result =new NodeSet();
        Iterator<Node> temp= n.iterator();
        while(temp.hasAnotherElement()){
            current =  temp.nextElement();
            if(current.accept(this).equals(target.getName())){
                result.add(current);
            }
        }
        return result;
    }

    @Override
    public void visit(NodeSet n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nameVisitor(Variable n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void report() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
