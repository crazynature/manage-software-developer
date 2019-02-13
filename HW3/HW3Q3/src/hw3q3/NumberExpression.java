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
public class NumberExpression extends Expression{
    private Variable number = new Variable();
    private int id ;
    public NumberExpression(int n, int i) {
        
        this.number.setName(String.valueOf(n));
        this.id=i;
    }
    
    @Override
    public String textualRepresentation() {
        return number.getName();
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
        return "Not a statement";
    }
}
