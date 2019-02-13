/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw3q3;

import java.util.NoSuchElementException;

/**
 *
 * @author cjrjh
 */
public class ArrayInterator<T> implements Iterator{
    
    protected int index;
    protected T[] data;

    public ArrayInterator(final T[] data) {
        this.data = data;
        index = 0;
    }
    
    
    @Override
    public boolean hasAnotherElement() {
        return index<data.length;
    }

    @Override
    public T nextElement() {

       if(this.hasAnotherElement()){
           return data[index++];
       }
       throw new NoSuchElementException("Data only has " + data.length 
               + " elements.");
    }

}
