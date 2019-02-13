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
public class Teacher extends User{
    

     /**
     *Parameters: 
     *Returns: a Student array
     *Interpretation: Get the students of current teacher
     *                  
     */
    public Student[] getStudents(){
        return null;
        
    }


     /**
     *Parameters: a non-negative interger
     *Returns: null
     *Interpretation:Choose a assignment
     *                  
     */    
    public void selectAssignment(int assignmentID){
        
    }
 

     /**
     *Parameters: two non-negative intergers
     *Returns: null
     *Interpretation:Choose two Submissions
     *                  
     */  
    public void selectSubmissions(Submission one, Submission two){
        
    }

     /**
     *Parameters: null
     *Returns: null
     *Interpretation:Create a assignment
     *                  
     */
    public void createAssignment(){
        
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
