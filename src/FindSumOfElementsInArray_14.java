
public class FindSumOfElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {5,2,7,9,6};//n=5-> n-1=4
		
		int sum=0;
		
		//using for loop
	/*	for(int i=0; i<=a.length-1;i++) //0, 1, 2, 3, 4
		{
			sum=sum+a[i];//0+5=5, 5+2=7, 14, 23, 29
		} */
		
		//Using Enhanced for loop this is also called as for each loop
		
		for(int value:a)
		{
			sum=sum+value;
		}
		
    System.out.println("Sum of Array elements: "+sum);
	}

}
