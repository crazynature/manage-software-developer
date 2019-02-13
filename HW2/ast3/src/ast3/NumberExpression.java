/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast3;

/**
 *
 * @author cjrjh
 */
public class NumberExpression extends Expression{
    private Variable number = new Variable();

    public NumberExpression(int n) {
        
        this.number.setName(String.valueOf(n));
    }
    
    @Override
    public String textualRepresentation() {
        return number.getName();
    }
    
}
