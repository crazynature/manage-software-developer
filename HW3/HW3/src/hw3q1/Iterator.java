/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3q1;

/**
 *
 * @author cjrjh
 */
/**
* A generic iterator
*/
public interface Iterator<T> {

 /**
* Check if there are more elements
*/
 boolean hasAnotherElement();
 /**
* Return the next element
*/
 T nextElement();
}
