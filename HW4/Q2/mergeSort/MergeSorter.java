/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergeSort;

/**
 *
 * @author cjrjh
 */
public class MergeSorter<T extends Comparable<T>> implements Sorter {

    @Override
    //Input:a Comparable list
    //Output: null
    //Interpretation: Sort the list
    public void sort(Comparable[] list) {
    	if(list!=null) {
    	
    	int start = 0;
    	for(int i = 0;i < list.length;i++) {
    		if(list[i]==null) {
    			Comparable temp = list[i];
    			list[i]=list[start];
    			list[start]=temp;
    			start++;
    		}
    	}
           Comparable[] temp = new Comparable[list.length];
           mergerSort(list,start,list.length-1,temp);
           
    }
    }

    //Input:two Comparable list, three integers for left block start, the block , right block end
    //Output: null
    //Interpretation: merge the two block together. first block is from list[first] to list[mid], 
    //                second block is from list[mid+1] to list[last]
    public void merge(Comparable[] list, int first, int mid, int last, Comparable[] temp) {
        int current = 0;
        int i = first;
        int j = mid + 1;
        int m = mid;
        int n = last;

        while (i <= m && j <= n) {
            if (list[i].compareTo(list[j]) <= 0) {
                temp[current] = list[i];
                current++;
                i++;
            } else {
                temp[current] = list[j];
                current++;
                j++;
            }
        }
        while (i <= m) {
            temp[current] = list[i];
            current++;
            i++;
        }
        while (j <= n) {
            temp[current] = list[j];
            current++;
            j++;
        }
        
        for(i=0;i<current;i++){
            list[first+i]=temp[i];
        }
    }

    //Input:two Comparable list, two integers for left block start , right block end
    //Output: null
    //Interpretation: merge sort the array by divide and conquer
    public void mergerSort(Comparable[] list, int first, int last, Comparable[] temp) {

        if (first < last) {
            int mid = (first + last) / 2;
            mergerSort(list, first, mid, temp);
            mergerSort(list, mid + 1, last, temp);
            merge(list, first, mid, last, temp);
        }

    }
}
