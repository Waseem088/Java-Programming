import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
	
		//Approach1
/*		boolean status=Arrays.equals(a1, a2);
		
		System.out.println(status);
		
		if(status==true)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		} */
		
		//Approach2
		//without using arrays equals method
		boolean status=true;
		
		if(a1.length == a2.length)
		{
			//comparing individual values inside array, if arrays length are equal
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					status=false; //if a1[i]!=a2[i] is not matches then this statement will print(false) or if matches then from actual statement(top defined) will print as true.
				}
			}
		}
		else
		{
			status=false;
		}
		
		if(status==true)
		{
		System.out.println("Arrays are Equal");	
		}
		else
		{
		System.out.println("Arrays are not Equal");
		}
		
	}

}
