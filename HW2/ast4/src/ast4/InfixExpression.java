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
public class InfixExpression extends Expression{
    private Operator operator;
    private Expression number1;
    private Expression number2;

    public InfixExpression(Operator operator, Expression number1, Expression number2) {
        this.operator = operator;
        this.number1 = number1;
        this.number2 = number2;
    }

    public InfixExpression() {
    }
    
    
    
    @Override
    public String textualRepresentation() {
        return number1.textualRepresentation()
                +operator.getOperator()
                +number2.textualRepresentation();
    }
    
}
