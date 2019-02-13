/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3q2;

/**
 *
 * @author cjrjh
 */
public class AstFactory {

    private static int countVar = 0;
    private static int countOpe = 0;
    private static int countVarExp = 0;
    private static int countNumExp = 0;
    private static int countPrefix = 0;
    private static int countInfix = 0;
    private static int countAssignment = 0;
    private static int countSequence = 0;
    private static int countDeclaration = 0;
    private static int id = 0;


    public static Expression createVarExp(Variable var) {
        Expression exp = new VariableExpression(var,id);
        countVarExp++;
      
        id++;
        return exp;
    }

    public static Expression createVarExp(String var) {
        Expression exp = new VariableExpression(var,id);
        countVarExp++;
      
        id++;
        return exp;
    }

    public static Expression creatNumberExp(int n) {
        Expression exp = new NumberExpression(n,id);
        countNumExp++;
        
        id++;
        return exp;
    }

    public static Expression createInfixExp(Operator o, Expression n,
            Expression m) {
        Expression exp = new InfixExpression(o, n, m,id);
        countInfix++;
     
        id++;
        return exp;
    }

    public static Expression createPrefixExp(Operator o, Expression n,
            Expression m) {
        Expression exp = new PrefixExpression(o, n, m,id);
        countPrefix++;
       
        id++;
        return exp;
    }

    public static Variable createVariable(String n) {
        Variable var = new Variable(n);
        countVar++;
        return var;
    }

    public static Operator createOperator(String n) {
        Operator ope = new Operator(n);
        countOpe++;
        return ope;
    }

    public static Statement createAssignment(Variable var, Expression exp) {
        Statement s = new Assignment(var, exp,id);
        countAssignment++;
        
        id++;
        return s;
    }

    public static Statement createSequence(Statement pre, Statement post) {

        Statement s = new Sequence(pre, post,id);
        countSequence++;
      
        id++;
        return s;
    }

    public static Statement createDcelaration(Variable var) {
        Statement s = new Declaration(var,id);
        countDeclaration++;
       
        id++;
        return s;
    }

    public static void report() {
        System.out.println("count of Varible: " + countVar);
        System.out.println("count of Operator: " + countOpe);
        System.out.println("count of VaribleExpression: " + countVarExp);
        System.out.println("count of NumberExpression: " + countNumExp);
        System.out.println("count of PrefixExpression: " + countPrefix);
        System.out.println("count of InfixExpression: " + countInfix);
        System.out.println("count of Assignment: " + countAssignment);
        System.out.println("count of Squence: " + countSequence);
        System.out.println("count of Declaration: " + countDeclaration);
    }

}
