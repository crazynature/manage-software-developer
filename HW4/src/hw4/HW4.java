/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.lang.Comparable;
import java.util.*;

/**
 *
 * @author cjrjh
 */
public class HW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer list[] = {3,6,2,8,1};
        System.out.println(Arrays.toString(list));

        Sorter test = new QuickSorter();
        test.sort(list);

        System.out.println(Arrays.toString(list));
        Integer list2[] = {3,6,2,8,1};
        System.out.println(Arrays.toString(list2));

        Sorter test2 = new MergeSorter();
        test.sort(list2);

        System.out.println(Arrays.toString(list2));

    }

}
