
public class PrintEvenOddfromArray {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6};
		
		//Extracting even numbers
		
	/*	System.out.println("Even numbers in array........");
		for(int i=0; i<a.length;i++)  //here not giving i<=a.length() because of index starting fromm 0
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}
		
		System.out.println("Even numbers in array........");
		for(int i=0; i<a.length;i++)  //here not giving i<=a.length() because of index starting fromm 0
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		} */
		
		//Using Enhanced for loop
		
		for(int value:a)
		{
			if(value%2==0) //or if(value%2!=0) 
				System.out.println(value); //2 4 6
		}

	}

}
