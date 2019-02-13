/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast4;

/**
 *
 * @author cjrjh
 */
public class Assignment extends Statement {
private Variable var;
private Expression exp;

    public Assignment(Variable var, Expression exp) {
        this.var = var;
        this.exp = exp;
    }

 
    @Override
    public String textualRepresentation() {
       
    return var.getName()+" = "+exp.textualRepresentation();
    }
}
