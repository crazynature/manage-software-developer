package tests2;

/**
 * Test suite to be used in CS5500 Homework 4, question 3.
 */
 
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import mergeSort.MergeSorter;

import mergeSort.Sorter;

public class MergeSorterTests {
  
    /**
     * Method for creating a sorter. Modify this to use your own sorter.
     * @return
     */
    private static <T extends Comparable<T>> Sorter<T> createSorter(){
      return new MergeSorter();
    }
  
  // -----------------------------------------------
  // sort a list with one String element
  
  @Test
  public void testOneElement(){ 
    Sorter<String> sorter = createSorter();
    String[] animals = { "dog" };
    sorter.sort(animals);
    String[] sorted = { "dog" };
    assertArrayEquals(animals, sorted);
  }
 
  
  
  // -----------------------------------------------
  // sort a list with one Integer element
  @Test
  public void testOneElementNumber(){ 
	    Sorter<Integer> sorter = createSorter();
	    Integer[] animals = { 1};
	    sorter.sort(animals);
	    Integer[] sorted = { 1 };
	    assertArrayEquals(animals, sorted);
	  }
  
   
  
  // -----------------------------------------------
  // sort a list with multiple String elements
  
  //even length list
  @Test
  public void testEvenMultipleElements(){
    Sorter<String> sorter = createSorter();
    String[] animals = { "dog", "cat", "pig", "cow", "horse" ,"bird"};
    sorter.sort(animals);
    String[] sorted = {"bird", "cat", "cow", "dog", "horse", "pig" };
    assertArrayEquals(animals, sorted);
  }
   
  
  //odd length list
  @Test
  public void testOddMultipleElements(){
    Sorter<String> sorter = createSorter();
    String[] animals = { "dog", "cat", "pig", "cow", "horse" };
    sorter.sort(animals);
    String[] sorted = { "cat", "cow", "dog", "horse", "pig" };
    assertArrayEquals(animals, sorted);
  }
  

   
  // -----------------------------------------------
  // sort a list with ints
  
  //even length list
  @Test
  public void testEvenints(){
    Sorter<Integer> sorter = createSorter();
    Integer[] ints = { 1, 4, 5, 3 };
    sorter.sort(ints);
    Integer[] sorted = { 1, 3, 4, 5 };
    assertArrayEquals(ints, sorted);
  }
  
  //odd length list
  @Test
  public void testOddints(){
    Sorter<Integer> sorter = createSorter();
    Integer[] ints = { 1, 4, 5, 3, 9 };
    sorter.sort(ints);
    Integer[] sorted = { 1, 3, 4, 5 ,9 };
    assertArrayEquals(ints, sorted);
  }
  
  
  //odd length list
  @Test
  public void testSameints(){
    Sorter<Integer> sorter = createSorter();
    Integer[] ints = { 1, 4, 5, 3, 9 ,1,1,1,1,3,3};
    sorter.sort(ints);
    Integer[] sorted = { 1,1,1,1,1,3,3, 3, 4, 5 ,9 };
    assertArrayEquals(ints, sorted);
  }
  
  //test negative number list
  @Test
  public void testNegativeints(){
    Sorter<Integer> sorter = createSorter();
    Integer[] ints = { -1, 4, 5, 3, 9 };
    sorter.sort(ints);
    Integer[] sorted = { -1, 3, 4, 5 ,9 };
    assertArrayEquals(ints, sorted);
  }
  
  
  @Test
  public void testAllNegativeints(){
    Sorter<Integer> sorter = createSorter();
    Integer[] ints = { -1, -4, -5, -3, -9 };
    sorter.sort(ints);
    Integer[] sorted = {-9,-5,-4,-3,-1 };
    assertArrayEquals(ints, sorted);
  }
  
  //test sorted(large to small) list
  @Test
  public void tesReverseints(){
    Sorter<Integer> sorter = createSorter();
    Integer[] ints = {9,8,7,6,5,4,3,2,1,0,};
    
    
    Integer[] sorted = {0,1,2,3,4,5,6,7,8,9,};

    sorter.sort(ints);
    assertArrayEquals(ints, sorted);
  }
  
  
  
  
  @Test
  public void testLargeints(){
    Sorter<Integer> sorter = createSorter();
    Integer[] ints =new Integer[1000];
    
    Integer[] sorted =new Integer[1000];
    for(int i = 0;i<1000;i++) {
    	ints[i]= 999-i;
    	sorted[i]=i;
    }
    
    sorter.sort(ints);
    assertArrayEquals(ints, sorted);
  }
  
  // -----------------------------------------------
  // sort an empty list (of strings)
  
  @Test
  public void testEmpty(){
    Sorter<String> sorter = createSorter();
    String[] animals = {  };
    sorter.sort(animals);
    String[] sorted = {  };
    assertArrayEquals(animals, sorted);
  }
  

  


  

  // -----------------------------------------------
  // sort a list with a null element or a null list
  
  @Test
  public void testNull(){ 
    Sorter<Integer> sorter = createSorter();
    Integer[] numbers = null ; 
    Integer[] sorted =  null;
    sorter.sort(numbers); 
    assertArrayEquals(numbers, sorted);
  }

  
  @Test
  public void testOnlyNull(){ 
    Sorter<Integer> sorter = createSorter();
    Integer[] numbers = { null }; 
    Integer[] sorted =  { null};
    sorter.sort(numbers); 
    assertArrayEquals(numbers, sorted);
  }

  
  
  @Test
  public void testIncludeNull(){ 
    Sorter<Integer> sorter = createSorter();
    Integer[] numbers = { 6, 2, null, 8 }; 
    Integer[] sorted =  { null, 2, 6, 8 };
    sorter.sort(numbers); 
    assertArrayEquals(numbers, sorted);
  }



@Test
public void testTwoNull(){ 
  Sorter<Integer> sorter = createSorter();
  Integer[] numbers = { 6, null, null, 8 ,5}; 
  Integer[] sorted =  { null, null, 5, 6, 8 };
  sorter.sort(numbers); 
  assertArrayEquals(numbers, sorted);
}


// -----------------------------------------------
// sort two list and check it they are same
@Test
public void testTwoInts(){ 
  Sorter<Integer> sorter = createSorter();
  Integer[] numbers1 = { 62, 42, 24, 83 }; 
  Integer[] numbers2 = { 62, 24, 42, 83 }; 

  sorter.sort(numbers1); 
  sorter.sort(numbers2); 
  assertArrayEquals(numbers1, numbers2);
}

@Test
public void testTwoIntsWithNull(){ 
	  Sorter<Integer> sorter = createSorter();
	  Integer[] numbers1 = { 60, 20, 40, 80,null }; 
	  Integer[] numbers2 = { 60, 40, null, 20, 80 }; 

	  sorter.sort(numbers1); 
	  sorter.sort(numbers2); 
	  assertArrayEquals(numbers1, numbers2);
	}

@Test
public void testTwoStrings(){ 
	  Sorter<String> sorter = createSorter();
	    String[] animals1 = { "dog", "cat", "pig", "cow", "horse" ,"bird"};
	    String[] animals2 = { "dog", "cow", "horse", "cat", "pig" ,"bird"};

	  sorter.sort(animals1); 
	  sorter.sort(animals2); 
	  assertArrayEquals(animals1, animals2);
	}

@Test
public void testTwoStringswithNull(){ 
	  Sorter<String> sorter = createSorter();
	    String[] animals1 = { "dog", "cat", "pig", null, "horse" ,"bird"};
	    String[] animals2 = { "dog", null, "horse", "cat", "pig" ,"bird"};

	  sorter.sort(animals1); 
	  sorter.sort(animals2); 
	  assertArrayEquals(animals1, animals2);
	}

}