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
public class Declaration extends Statement{
private Variable var;
private int id;
    public Declaration() {
    }

    public Declaration(Variable var, int i) {
        this.var = var;
        id  =i;
    }

    public Variable getVar() {
        return var;
    }


    public String textualRepresentation() {
        return "var "+var.getName();
   }
    
        @Override
    public int getId() {
       
        return id;
    }

    @Override
    public void accept(ASTNodeCountVisitor v) {
        v.visit(this);
    }
    
        public String accept(ASTSearchVisitor v){
       return v.searchVisitor(this);
    }
    
}
