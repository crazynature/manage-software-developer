/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3q3;

/**
 *
 * @author cjrjh
 */
public interface ASTVisitor {
    void visit(NodeSet n);
    String searchVisitor(Assignment n);
    String searchVisitor(Declaration n);

     void report() ;
    String nameVisitor(Variable n);
     NodeSet search(NodeSet n, Variable target);
    
}
