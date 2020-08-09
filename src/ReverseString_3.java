
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3 Ways of Reverse a String
		
	// 1. Using + (String concatenation) operator
		
		String str="ABCD";
		String rev=""; //to store reverse value
		
	/*	int len=str.length(); //4
		
		for(int i=len-1;i>=0;i--) //since char will start from 0 so doing subtraction by 1 for length
		{
			rev=rev+str.charAt(i); //DCBA
		}
		System.out.println("Reversed string is:"+ rev); */
		
	//	2. Using character array
		
	/*	char a[]=str.toCharArray(); //here stored all the string characters into a single character array
		int len=a.length; //4
		
		for(int i=len-1;i>=0;i--) //3 2 1 0 -1
		{
			rev=rev+a[i]; //DCBA
		}
		System.out.println("Reversed string is:"+ rev); */
		
	//	3. Using StringBuffer class
		
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	}

}
