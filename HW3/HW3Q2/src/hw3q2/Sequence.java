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
public class Sequence extends Statement {

    private Statement head;
    private Statement tail;
    private int id;
    public Sequence() {
    }

    public Sequence(Statement head, Statement tail, int i) {
        this.head = head;
        this.tail = tail;
        id = i;
    }
    
    @Override
    public String textualRepresentation() {
        return head.textualRepresentation()+"; "+tail.textualRepresentation();
    }

    @Override
    public int getId() {
       return id;
    }
    
}
