
public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		int num=123456; //need to foun out how many digits are thr in this number
		
		int count=0;
		
		while(num>0)
		{																																																																		
			num=num/10; //12345, 1234, 123, 12, 1, 0
			count++;
		}
		
        System.out.println("Number of Digits:" +count);
		
	}

}
