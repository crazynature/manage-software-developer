/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast4;

/**
 *
 * @author cjrjh
 */
public class Sequence extends Statement {
    private final static Sequence INSTANCE =new Sequence();
    private Statement head;
    private Statement tail;

    private Sequence() {
    }

    public static Sequence setInstance(Statement head, Statement tail) {
        
        INSTANCE.head = head;
        INSTANCE.tail = tail;
      return INSTANCE;
    }
     public static Sequence getInstance() {
        
 
        return INSTANCE;
      
    }
    @Override
    public String textualRepresentation() {
        return INSTANCE.head.textualRepresentation()+"; "+
                INSTANCE.tail.textualRepresentation();
    }
    
}
