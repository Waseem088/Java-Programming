import java.util.Scanner;

//Palindrome Number : A Palindrome Number is a number that remains the same when its digits are reversed. like 16461

public class PalindromeNumber {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter the Number:");
		int num=sc.nextInt(); 
		
		int org_num=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10; 
			num=num/10; 
		} 
		
		if(org_num==rev)
		{
			System.out.println("Palindrome Number: " +org_num); //16461
		}
		else
		{
			System.out.println("Not a Palindrome Number: " +org_num); //1234
		}
				

	}

}
