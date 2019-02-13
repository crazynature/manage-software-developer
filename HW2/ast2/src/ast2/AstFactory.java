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
public class AstFactory {

    public static Expression createVarExp(Variable var) {
        Expression exp = new VariableExpression(var);
        return exp;
    }

    public static Expression createVarExp(String var) {
        Expression exp = new VariableExpression(var);
        return exp;
    }

    public static Expression creatNumberExp(int n) {
        Expression exp = new NumberExpression(n);
        return exp;
    }

    public static Expression createInfixExp(Operator o, Expression n,
            Expression m) {
        Expression exp = new InfixExpression(o, n, m);
        return exp;
    }

    public static Expression createPrefixExp(Operator o, Expression n,
            Expression m) {
        Expression exp = new PrefixExpression(o, n, m);
        return exp;
    }

    public static Variable createVariable(String n) {
        Variable var = new Variable(n);
        return var;
    }

    public static Operator createOperator(String n) {
        Operator ope = new Operator(n);
        return ope;
    }

    public static Statement createAssignment(Variable var, Expression exp) {
        Statement s = new Assignment(var, exp);
        return s;
    }

    public static Statement createSequence(Statement pre, Statement post) {
        Statement s = new Sequence(pre, post);
        return s;
    }

    public static Statement createDcelaration(Variable var) {
        Statement s = new Declaration(var);
        return s;
    }
}
