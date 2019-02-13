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
public abstract class User {
    public enum UserType { studnet,teacher,admin} 
 
    
    //the current user's id
    public int id;
    //the current user's type
    public UserType type;
    //the current user's first name
    public String fisrtName;
    //the current user's last name
    public String lastName;
    //the current user's username
    public String username;
    //the current user's password
    private String password;
    
    
      /**
     *Parameters: 
     *Returns: a integer
     *Interpretation: Get the current user's ID
     *                  
     */
    public abstract int getId();
    
       /**
     *Parameters: null
     *Returns: null
     *Interpretation: create a new user
     *                  
     */
    public abstract void register();
    
           /**
     *Parameters: null
     *Returns: null
     *Interpretation: Log in the current user
     *                  
     */
    public abstract void login();
    
           /**
     *Parameters: a String for username and a String for password
     *Returns: ture for found that use and false for not found
     *Interpretation: check if the system has that user
     *                  
     */
    public abstract Boolean findUser(String username, String password);
            
    
}
