
public class MaxAndMinValueInArray {

	public static void main(String[] args) {
		
		int a[]= {50,30,40,20,60};
		
		int max=a[0]; //50
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i]; //60
		    }
		}
		System.out.println("Maximum  value of array is: "+max);
		
        int min=a[0]; //50
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i]; //20
		    }
		}
		System.out.println("Minimum  value of array is: "+min);
		

	}

}
