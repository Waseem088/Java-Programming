import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	lets take input from the user
		
		Scanner sc=new Scanner(System.in); //System.in- this will accept the value from user at the runtime
		
		System.out.println("Enter the Number:");
		int num=sc.nextInt(); //.nextInt method- will accept the value from user and stores inside num variable 
		//ex: 1234(input from user)
		
	//3 Ways of Reverse a Number	
		
		//1. Using algorith1m
		//most of the people will use this method
	/*	int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10; //0*10+1234%10=0+4=4, 40+123%10=40+3=43, 430+2=432, 4320+1=4321
			num=num/10; // 1234/10=123, 123/10=12, 12/10=1, 1/10=0
		} */ 
		
	   //2. Using StringBuffer class -in StringBuffer there is method called reverse method(by using that method we can directly reverse a String without using any logic)
	//	StringBuffer rev;
	/*	StringBuffer sb=new StringBuffer(String.valueOf(num)); //String.valueOf(num) - will convert number into string format and that String value will store under sb
		StringBuffer rev=sb.reverse();
		
		
		System.out.println("Reverse Number is:"+ rev); */
		
	  //3. Using StringBuilder class
		StringBuilder sb1=new StringBuilder();
		sb1.append(num); //append(num) method - will append our number to this(sb1) variable
		StringBuilder rev=sb1.reverse();
		
		System.out.println("Reverse Number is:"+ rev);
		
		
	}

}
