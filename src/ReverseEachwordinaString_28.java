//How to Reverse Each Word in a String
//String- WELCOME TO JAVA
//1. split the string into 3 diff parts that depends on the no of words
//2. and those parts have to store in a String array, after that have to apply reverse string algorithm on these particular 3 diff string.
//3. after reversing each and every word then we have combine them into one single String

public class ReverseEachwordinaString {

	public static void main(String[] args) {
		
	    //Approach1 - Logic
	/*	String str="Welcome To Java"; // original string -"Welcome To Java";
		
		String[] words=str.split(" "); //Splitting string into words, this method will split the whole string into multiple parts where ever the space is occured
		
		String reverseString=""; //currently empty
		
		for(String w:words) //1st welcome, 2nd To, 3rd Java
		{
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--) //welcome, To, Java
			{
				reverseword=reverseword+w.charAt(i);
			}
			
			reverseString=reverseString+reverseword+" "; //emocleW + oT + avaJ
		}
		
		System.out.println(reverseString); */
		
		//Approach2 _ Using built in method to reverse the word
		
		String str="Welcome To Java"; 
		String[] words=str.split("\\s"); //\\s-is equal to space in regular expression
				
        String reverseword="";
		
		for(String w:words) //welcome, To, Java 
		{
			StringBuilder sb=new StringBuilder(w); //built in method to reverse the word
			sb.reverse(); //amocleW, oT, avaJ
			
			reverseword=reverseword+sb.toString()+" "; //amocleW oT avaJ
		}
		
		System.out.println(reverseword);
 
   
		

	}

}
