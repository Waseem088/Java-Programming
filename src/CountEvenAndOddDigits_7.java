
public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
		int num=12345;
		
	//defining two different variables to maintain the count even and odd	
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10; //1234%10=4, 3, 2, 1
			
			if(rem%2==0)
			{
				even_count++; //1, 2
			}
			else
			{
				odd_count++; //1, 2
			}
			
			num=num/10; //1234/10=123 will eliminate one number for each iteration, 12, 1
		}
		
		System.out.println("Number of Even Numbers: "+even_count);
		System.out.println("Number of odd Numbers: "+odd_count);

	}

}
