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
public interface IBitVector {
/**
 * Determine if the bit at position i is set.
 */
public boolean get(int i);
/**
 * Set the bit at position i.
 */
public void set(int i);

/**
 * Clear the bit at position i.
 */
public void clear(int i);
/**
 * Set the bits in the argument BitVector b.
 */
public void copy(BitVector b);
/**
 * Determine the number of non-zero bits in the BitVector.
 */
public int size();
/**
 * Iterator over the Integer values represented by this BitVector.
 */
public Iterator<Integer> iterator();
}
