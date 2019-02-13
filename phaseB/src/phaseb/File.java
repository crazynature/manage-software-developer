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
class File {
    //current file's name
    private String fileName;
    //current file's ID
    private int fileId;
    //the content of current file
    private String[] content;
    
     /**
     *Parameters: a integer for file id
     *Returns: null
     *Interpretation:read the data from the file
     *                  
     */
    public void readData(int id){
        
    }
    
     /**
     *Parameters: a File
     *Returns: null
     *Interpretation:upload a file
     *                  
     */
    public void upload(File file){
        
    }
    
    /**
     *Parameters: the integer for file id
     *Returns: the file with the input id
     *Interpretation:get a file from database
     *                  
     */
    public File getFile(int id){
        return null;
        
    }
    /**
     *Parameters: the integer for file id
     *Returns: null
     *Interpretation:remove a file from database
     *                  
     */
    public void remove(int id){
        
    }
}
