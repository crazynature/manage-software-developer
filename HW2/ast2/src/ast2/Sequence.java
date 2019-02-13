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
public class Sequence extends Statement {

    private Statement head;
    private Statement tail;

    public Sequence() {
    }

    public Sequence(Statement head, Statement tail) {
        this.head = head;
        this.tail = tail;
    }
    
    @Override
    public String textualRepresentation() {
        return head.textualRepresentation()+"; "+tail.textualRepresentation();
    }
    
}
