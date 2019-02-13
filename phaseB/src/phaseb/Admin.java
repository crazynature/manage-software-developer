/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phaseb;

/**
 *
 * @author cjrjh
 */
public class Admin extends User{


     /**
     *Parameters: a String for username, a String for password and a Usertype
     *Returns: null
     *Interpretation:Create a new user
     *                  
     */
    public void creatUser(String username, String passwordString, UserType type){
        
    }
    
     /**
     *Parameters: a integer for user's id
     *Returns: null
     *Interpretation:Delete a user
     *                  
     */
    public void deleteUser(int number){
        
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void register() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean findUser(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
}
