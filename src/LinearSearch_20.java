//Searching an Element in Array
//Linear Search(also called as sequential search) - if set of values present in array and want to search the Particular value is present or not in array i.e., called linear search

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,50,30};
		
		int search_ele=100;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			if(search_ele==a[i])
			{
				System.out.println("Element is found at: "+i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}

	}

}
