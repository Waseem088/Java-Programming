import java.util.Arrays;

//a->4 2 1 5 3 n=5
//Bubble sort - need to compare two adjacent elements and if the 1st element is > than the 2nd then we need to swap those two elements. 
//              and if the 1st element is not > the second element, we should not swap those elements
//              So, bubble short works based on this principles.

//pass1 2 4 1 5 3                 pass3 1 2 3 4 5        
//      2 1 4 5 3                       1 2 3 4 5
//      2 1 4 5 3                       1 2 3 4 5
//      2 1 4 3 5 ->5                   1 2 3 4 5 -> 3 4 5   

//pass1 1 2 4 3 5                 pass4 1 2 3 4 5
//      1 2 4 3 5                       1 2 3 4 5
//      1 2 3 4 5                       1 2 3 4 5
//      1 2 3 4 5 ->4 5                 1 2 3 4 5 -> 2 3 4 5

//how many no of passes to continue that depends on the number of elements(n=5), so no of passes should be n-1(5-1=4).

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {4,2,1,5,3}; //{40,2,1,50,3};, {40,2,100,50,3};
		
		System.out.println("Array before sorting: "+ Arrays.toString(a));// Arrays.toString(a)) this method will print all the values in the list
		
		int n=a.length;
		
		//two for loops- one for no of passes, internally one for loop, that is for comparing two elements and also swapping of two elements if one value is > than another value
		
		for(int i=0;i<n-1;i++) //Number of passes
		{
			for(int j=0;j<n-1;j++) //Iteration in each pass
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting: "+ Arrays.toString(a));
	}

}
