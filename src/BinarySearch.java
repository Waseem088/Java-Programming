import java.util.Arrays;

//Searching element in Array using Binary search algorithm
//pre-requisite
//Array should be in sorted order
//every time need to split array into two diff part based up on the mid value
//if key value is less than mid value then have to go left direction(checking only those present left side values)
//If our key value is greater than mid value then have to right direction

//case1 key==Mid
//case2 key>Mid L=MID+1
//case3 key<Mid H=MID-1
public class BinarySearch {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10}; //Array should be in sorted order
		
		//Approach1 - Logic
		boolean flag=false;
		
		int key=0;
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			
			if(a[m]==key)
			{
				System.out.println("Element found");
				flag=true;
				break;	
			}
			
			if(a[m]<key)
			{
				l=m+1;
			}
			
			if(a[m]>key)
			{
				h=m-1;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		} 
		
		//Approach2 - Arrays.binarySearch()
	//	System.out.println(Arrays.binarySearch(a, 8)); //internally .binarySearch method using the same Logic of above defined methods

	}
 
}

//
