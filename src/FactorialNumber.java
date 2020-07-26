
//A Factroial is a function that multiplies a number by every number below it.
//For example
//5!=5*4*3*2*1=120.
//OR
//5!=1*2*3*4*5=120.

public class FactorialNumber {

	public static void main(String[] args) {
	//first will go with for loop then while loop	
		int num=5;
		
		long factorial =1; //sometimes factorial will be lengthy integer so using long for variable factorial
		
		//5*4*3*2*1 - descending order
	/*	for(int i=1;i<=num;i++) 
		{
			factorial=factorial * i; //1, 2, 6, 24, 120
		} */
		
		//1*2*3*4*5 - ascending order
		for(int i=num;i>=1;i--) 
		{
			factorial=factorial * i; //5, 20, 60, 120
		} 
		
		System.out.println("Factorial of a Number is: " +factorial);
		
	}

}
