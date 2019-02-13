/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast2;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cjrjh
 */
public class AssignmentTest {
    
    public AssignmentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of textualRepresentation method, of class Assignment.
     */
    @Test
     public  void testMain() {

Variable x = AstFactory.createVariable("x");
Expression var =  AstFactory.createVarExp(x);
Expression one = AstFactory.creatNumberExp(1);
Expression two =AstFactory.creatNumberExp(2);
Operator plus = AstFactory.createOperator("+");
Expression exp =  AstFactory.createInfixExp(plus, one, two);
Expression preExp =  AstFactory.createPrefixExp(plus, one, two);
Statement decl = AstFactory.createDcelaration(x);
Statement assign = AstFactory.createAssignment(x, exp);
Statement seq = AstFactory.createSequence(decl, assign);
assertEquals(seq.textualRepresentation(), "var x; x = 1+2");
assertEquals(one.textualRepresentation(), "1");
assertEquals(two.textualRepresentation(), "2");
assertEquals(plus.getOperator(), "+");
assertEquals(x.getName(), "x");
assertEquals(decl.textualRepresentation(), "var x");
assertEquals(assign.textualRepresentation(), "x = 1+2");
assertEquals(var.textualRepresentation(), "x");


assign = AstFactory.createAssignment(x, preExp);
seq = AstFactory.createSequence(decl, assign);
assertEquals(assign.textualRepresentation(), "x = +(1) (2)");
assertEquals(seq.textualRepresentation(), "var x; x = +(1) (2)");



Expression exp1 =  AstFactory.createInfixExp(plus, one, two);
Expression exp2=  AstFactory.createInfixExp(plus, two,one);

Expression preExp1 =  AstFactory.createPrefixExp(plus, exp1, exp2);
assign = AstFactory.createAssignment(x, preExp1);
seq = AstFactory.createSequence(decl, assign);
assertEquals(assign.textualRepresentation(), "x = +(1+2) (2+1)");
assertEquals(seq.textualRepresentation(), "var x; x = +(1+2) (2+1)");


    }
    
}
