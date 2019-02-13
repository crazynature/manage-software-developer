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

public class Ast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Variable x = new Variable("x");
Expression one = new NumberExpression(1);
Expression two = new NumberExpression(2);
Operator plus = new Operator("+");
Expression exp = new InfixExpression(plus, one, two);
Statement decl = new Declaration(x);
Statement assign = new Assignment(x, exp);
Statement seq = new Sequence(decl, assign);
System.out.print(seq.textualRepresentation());
    }
    
}
