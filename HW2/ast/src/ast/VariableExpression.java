/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author cjrjh
 */
public class VariableExpression extends Expression{

     private Variable var;

    public VariableExpression(Variable n) {
        this.var= n;
    }

    public VariableExpression() {
    }
       public VariableExpression(String n) {
        var= new Variable(n);
        
    }
    @Override
    public String textualRepresentation() {
        return var.getName();
    }
    
    
}
