package quickSort;


public class QuickSorter<T extends Comparable<T>> implements Sorter{
	


    //Input:a Comparable list,two integer for start ,end 
    //Output: null
    //Interpretation: quick sort the list by partition
	public void quicksort(Comparable[] list,int left,int right) {

		
		if(right >left) {
			int pivotNewIndex= partition(list,left,right,right);
			quicksort(list,left,pivotNewIndex-1);
			quicksort(list,pivotNewIndex+1,right);
		}
	
	}
	
    //Input:a Comparable list,three integer for start ,end and pivot index
    //Output: a integer
    //Interpretation: find the pivot index and return it
	public int partition(Comparable[] list, int left,
			int right,int pivotIndex) {
		Comparable pivotValue = list[pivotIndex];
		Comparable temp = list[right];
		list[right]= list[pivotIndex];
		list[pivotIndex] = temp;
		int storeIndex = left;
		for(int i = left; i<right;i++) {
			if(list[i].compareTo(pivotValue)<=0) {
				temp = list[storeIndex];
				list[storeIndex]= list[i];
				list[i] = temp;
				storeIndex++;
			}
		}
		temp = list[storeIndex];
		list[storeIndex]= list[right];
		list[right] = temp;
		
		return storeIndex;
	}

	
    //Input:a Comparable list
    //Output: null
    //Interpretation: sort the list from small to large
	@Override
	public void sort(Comparable[] list) {
	
		if(list != null) {
		int start = 0;
	
    	for(int i = 0;i < list.length;i++) {
    		if(list[i]==null) {
    			Comparable temp = list[i];
    			list[i]=list[start];
    			list[start]=temp;
    			start++;
    		}
		
    	}
		quicksort(list,start,list.length-1);
		
		}

	}
	
	

}
