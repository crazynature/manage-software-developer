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
public class PrefixExpression extends Expression{
        private Operator operator;
    private Expression number1;
    private Expression number2;

    public PrefixExpression() {
    }

    public PrefixExpression(Operator operator, Expression number1, Expression number2) {
        this.operator = operator;
        this.number1 = number1;
        this.number2 = number2;
    }

 
    
    
    
    @Override
    public String textualRepresentation() {
        return operator.getOperator()+
                "("+number1.textualRepresentation()+") "
                +"("+number2.textualRepresentation()+")";
    }
    
}
