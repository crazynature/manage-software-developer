/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author cjrjh
 */
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ast.*;
/**
 *
 * @author cjrjh
 */
public class AstTest {
    
    public AstTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class Ast.
     */
    @Test
    public void testMain() {

Variable x = new Variable("x");
Expression var = new VariableExpression(x);
Expression one = new NumberExpression(1);
Expression two = new NumberExpression(2);
Operator plus = new Operator("+");
Expression exp = new InfixExpression(plus, one, two);
Statement decl = new Declaration(x);
Statement assign = new Assignment(x, exp);
Statement seq = new Sequence(decl, assign);
assertEquals(seq.textualRepresentation(), "var x; x = 1+2");
assertEquals(one.textualRepresentation(), "1");
assertEquals(two.textualRepresentation(), "2");
assertEquals(plus.getOperator(), "+");
assertEquals(decl.textualRepresentation(), "var x");
assertEquals(assign.textualRepresentation(), "x = 1+2");
assertEquals(var.textualRepresentation(), "x");
Expression preExp =  new PrefixExpression(plus, one, two);
assign = new Assignment(x, preExp);
seq = new Sequence(decl, assign);
assertEquals(assign.textualRepresentation(), "x = +(1) (2)");
assertEquals(seq.textualRepresentation(), "var x; x = +(1) (2)");



Expression exp1 = new InfixExpression(plus, one, two);
Expression exp2=  new InfixExpression(plus, two,one);

Expression preExp1 =  new PrefixExpression(plus, exp1, exp2);
assign =  new Assignment(x, preExp1);
seq = new Sequence(decl, assign);
assertEquals(assign.textualRepresentation(), "x = +(1+2) (2+1)");
assertEquals(seq.textualRepresentation(), "var x; x = +(1+2) (2+1)");
    }
    
}

