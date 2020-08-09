import java.util.Arrays;
import java.util.Collections;

//How to sort elements in Array using built-in methods 

public class SortingElementsinArray {

	public static void main(String[] args) {
		
		//Approach1
		
	/*	int a[]= {30,50,20,10,60};
		System.out.println("Array elements before sorting: "+Arrays.toString(a)); //Arrays.toString(a) - method will print in the form of List
	
        Arrays.parallelSort(a);//this parallelSort(a) method will sort the array
	    System.out.println("Array elements After sorting: "+Arrays.toString(a)); */
	    
	  //Approach2
	/*	int a[]= {30,50,20,10,60};
		System.out.println("Array elements before sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array elements After sorting: "+Arrays.toString(a)); */
		
	  //reverse order i.e., descending order
		Integer a[]= {30,50,20,10,60};
		System.out.println("Array elements before sorting: "+Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder()); //collections.reverseOrder - will not support primitive data type (instead of int have to specify the deravative type Integer to array(this(Integer) not a primitive data type)
		System.out.println("Array elements After sorting: "+Arrays.toString(a)); 
		
		
	}

}
