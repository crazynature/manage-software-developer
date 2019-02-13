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
public class Variable {
    private String name;
    public Variable(){
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Variable(String name) {
        this.name = name;
    }
    
    
}
