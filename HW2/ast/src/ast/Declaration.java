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
public class Declaration extends Statement{
private Variable var;

    public Declaration() {
    }

    public Declaration(Variable var) {
        this.var = var;
    }


    @Override
    public String textualRepresentation() {
        return "var "+var.getName();
   }
    
}
