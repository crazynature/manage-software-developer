/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3q2;

/**
 *
 * @author cjrjh
 */
public class Assignment extends Statement {
private Variable var;
private Expression exp;
private int id;
    public Assignment(Variable var, Expression exp,int i) {
        this.var = var;
        this.exp = exp;
        this.id = i;
    }

 
    public String textualRepresentation() {
       
    return var.getName()+" = "+exp.textualRepresentation();
    }
    
        @Override
    public int getId() {
       
        return id;
    }
    
}
