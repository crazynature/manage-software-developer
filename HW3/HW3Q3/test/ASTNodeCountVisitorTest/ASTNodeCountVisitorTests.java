/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASTNodeCountVisitorTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import hw3q3.*;

/**
 *
 * @author cjrjh
 */
public class ASTNodeCountVisitorTests {
    
    public ASTNodeCountVisitorTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
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


NodeSet s = new NodeSet();
s.add(var);
s.add(one);
s.add(two);
s.add(exp);
s.add(preExp);
s.add(assign);
s.add(seq);
s.add(decl);
AstFactory.report();

ASTVisitor v = new ASTNodeCountVisitor();
v.visit(s);
v.report();

    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
