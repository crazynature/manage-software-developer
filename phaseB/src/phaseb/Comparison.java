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
public interface Comparison {
    /**
     *Parameters: two Submission
     *Returns: null
     *Interpretation: Compare two different submission and save the result to
     *                  current Comparison instance
     */
   public void compare(Submission one, Submission two);
   
   /**
   *Parameters: null
   *Returns: the current comparison's result
   *Interpretation:get the result from current comparison
   *                  
   */
   public double reportResult();
}
