//How to count words in a String
import java.util.Scanner;

public class CountTheWords {
	
	//String str = “Having 3+ years of industry experience in Software Testing as a Software Test Engineer QA in Schneider Electric”;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print only 0's present in str1
//		String str1 = "10100100010";

		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.equals("0"))
			{	
			count++;
			System.out.println(s);
			}
		}
		
		
		//Approach1
		
/*		System.out.println("Enter the string:");
		
		//to write user input through console will be using Scanner class
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();  //Welcome to Java - this is the string
		
		int count=1; //initially count is one
		
		for(int i=0; i<s.length()-1; i++) //since it(char method) will start from zero here giving -1 for length
			
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) //comparing if space comes that is one word && if it has more than one space don't count 
			{
				count++; //just counting the no of words, what words means(after completion of words there should be some space and after the space thr should not be any empty value thr should be some character)
			}
			
		}
		
		System.out.println("Number of words in a string:"+ count ); 
	//this is how we need to find no of words present in a string by using char method
		
		//Approach2
	//	There is one more easy approach.
	/*	String str = "Welcome to the Java tutorials";
		String strArray[]=str.split(" ");
		System.out.println("The number of words in a string is " + strArray.length); */


		
			


	}

}
