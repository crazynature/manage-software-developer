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
public class Declaration extends Statement{
private Variable var;
private int id;
    public Declaration() {
    }

    public Declaration(Variable var, int i) {
        this.var = var;
        id  =i;
    }


    public String textualRepresentation() {
        return "var "+var.getName();
   }
    
        @Override
    public int getId() {
       
        return id;
    }
    
}
