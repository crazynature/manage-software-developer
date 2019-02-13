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
public  class ASTNodeCountVisitor implements ASTVisitor {

    private int size;

    private static int countVarExp = 0;
    private static int countNumExp = 0;
    private static int countPrefix = 0;
    private static int countInfix = 0;
    private static int countAssignment = 0;
    private static int countSequence = 0;
    private static int countDeclaration = 0;
    private static int id = 0;

    @Override
    public void visit(NodeSet n) {
        Iterator<Node> temp = n.iterator();
        while (temp.hasAnotherElement()) {
            temp.nextElement().accept(this);
        }
    }

    public void visit(VariableExpression n) {
        countVarExp++;
  //      System.out.println("count of Varible: " + countVarExp);
        size++;
    }

    public void visit(NumberExpression n) {
        countNumExp++;
 //       System.out.println("count of NumberExpression: " + countNumExp);
        size++;
    }

    public void visit(PrefixExpression n) {
        countPrefix++;
  //      System.out.println("count of PrefixExpression: " + countPrefix);
        size++;
    }

    public void visit(InfixExpression n) {
        countInfix++;
   //     System.out.println("count of InfixExpression: " + countInfix);
        size++;
    }

    public void visit(Assignment n) {
        countAssignment++;
  //      System.out.println("count of Assignment: " + countAssignment);
        size++;
    }

    public void visit(Sequence n) {
        countSequence++;
 //       System.out.println("count of Sequence: " + countSequence);
        size++;
    }

    public void visit(Declaration n) {
        countDeclaration++;
//        System.out.println("count of Declaration: " + countDeclaration);
        size++;
    }
    
        public  void report() {
   
        System.out.println("count of VaribleExpression: " + countVarExp);
        System.out.println("count of NumberExpression: " + countNumExp);
        System.out.println("count of PrefixExpression: " + countPrefix);
        System.out.println("count of InfixExpression: " + countInfix);
        System.out.println("count of Assignment: " + countAssignment);
        System.out.println("count of Squence: " + countSequence);
        System.out.println("count of Declaration: " + countDeclaration);
    }

    @Override
    public String searchVisitor(Assignment n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String searchVisitor(Declaration n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String nameVisitor(Variable n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NodeSet search(NodeSet n, Variable target) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
