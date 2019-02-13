/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast2;



/**
 *
 * @author cjrjh
 */
public class Ast2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
Variable x = AstFactory.createVariable("x");
Expression one = AstFactory.creatNumberExp(1);
Expression two =AstFactory.creatNumberExp(2);
Operator plus = AstFactory.createOperator("+");
Expression exp =  AstFactory.createInfixExp(plus, one, two);
Statement decl = AstFactory.createDcelaration(x);
Statement assign = AstFactory.createAssignment(x, exp);
Statement seq = AstFactory.createSequence(decl, assign);
    }
    
}
