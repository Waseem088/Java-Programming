import java.util.Scanner;

//Palindrome String: A Palindrome String is a String that remains the same when its characters are reversed. like MADAM

public class PalindromeString {
	
	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in); 
		
	   System.out.println("Enter the String:");
		
	   String str=sc.next(); //can use next or nextline method
	   String org_str=str;
	   
	   String rev="";
	   
	   int len=str.length(); //4
		
		for(int i=len-1;i>=0;i--) //since char will start from 0 so subtracting by 1 for length
		{
			rev=rev+str.charAt(i); 
		}
		
		if(org_str.equals(rev))
		{
			System.out.println(org_str+" is a Palindrome String"); //MADAM
		}
		else
		{
			System.out.println(org_str+" is Not a Palindrome String"); 
		}
	}

}
