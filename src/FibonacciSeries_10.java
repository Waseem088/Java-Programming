//Fibonacci Series : A series of numbers in which each number (Fibonacci number) is the sum of the two preceding numbers.

//0 1 1 2 3 5 8 13 21 34
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1+" "+n2); //0 1 //removed ln so that it will print in single line
		
		for(int i=2;i<10;i++) //repeat 10 times
		{
			sum=n1+n2; //0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8
			System.out.print(" "+sum); //1 2 3 5 8 13 21 34 //removed ln so that it will print in single line 
			n1=n2; //1, 1, 2, 3, 5
			n2=sum; //1, 2, 3, 5, 8
		}
	}

}
