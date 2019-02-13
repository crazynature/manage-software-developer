/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3q2;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 *
 * @author cjrjh
 */
public abstract class Node {

    public Node() {
    }

    /**
     *
     */
    public static Map <Integer,  Node> data = new HashMap();
    public abstract String textualRepresentation();
    /**
 * Returns unique identifier for each node.
 */
public abstract int  getId();

/**
 * Reverse mapping from Nodes to their unique identifiers
 */
public static Node getNode(int id) throws NoSuchElementException {
    
return data.get(id);
}

    
}
