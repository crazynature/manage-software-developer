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
public class VariableExpression extends Expression{

     private Variable var;
      private int id;
    public VariableExpression(Variable n, int i) {
        this.var= n;
        this.id = i;
    }

    public VariableExpression() {
    }
       public VariableExpression(String n, int i) {
        var= new Variable(n);
        id =i;
        
    }
    @Override
    public String textualRepresentation() {
        return var.getName();
    }
       @Override
    public int getId() {
       
        return id;
    }
     
        @Override
    public void accept(ASTNodeCountVisitor v) {
        v.visit(this);
    }

    @Override
         public String accept(ASTSearchVisitor v){
        return "Not a statement";
    }
}
