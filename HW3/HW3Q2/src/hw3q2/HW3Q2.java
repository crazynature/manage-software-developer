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
public class HW3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AstFactory abg = new AstFactory();
        Variable x = AstFactory.createVariable("x");
Expression var =  AstFactory.createVarExp(x);
Expression one = AstFactory.creatNumberExp(1);

    }
    
}
