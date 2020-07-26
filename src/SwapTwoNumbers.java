
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//5 different ways of swapping two numbers
//Swapping- is nothing but inerchanging the values into variables 
		
		int a=10, b=20;
		
		System.out.println("Before swapping values are.. "+a+" "+b);
		
	  //Logic1 - third variable
	 /* int t=a; //t=10
		a=b;     //a=20
		b=t;     //b=10 */
		
	  //Logic2 - use + & - without using third variable
	  /*a=a+b; //10+20=30
		b=a-b; //30-20=10
		a=a-b; //30-10=20 */
		
      //Logic3 - use + & - without using third variable	
      //here a & b values should not be zero
	/*	a=a*b; //10*20=200
		b=a/b; //200/20=10
		a=a/b; //200/10=20 */
		
	  //Logic4 - bitwise XOR (^) 	
	  //here a & b values should not be zero
	/*	a=a^b; //10^20=30  //10 to binary- 1010
		b=a^b; //30^20=10  //20 to binary- 10100
		a=a^b; //30^10=20  //total   a^b = 11110=30 */
		
	  //Logic5 - with Single statement	
	    b=a+b-(a=b);  //10+20-(a=20) 30-20=10
		
		System.out.println("After swapping values are.. "+a+" "+b);
		
	}

}
