//How to Remove Junk or Special Characters in String
public class RemoveJunkChars {

	public static void main(String[] args) {
		
		String s="$@#$%^&*(*% latin string 01234567890";
		
		String s1="@#$@#$@ testing #@#$@#$ Selenium !@#$@#$@# &&&& Java";
		
		s=s.replaceAll("[^a-zA-Z0-9]", ""); //char(^) operator - other than this(a-zA-Z0-9) range if it is found anything else inside the string that will be replaced by empty("")
		System.out.println(s);
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		//this is how we can just replace junk or special characters from a string by using regular expression
	}

}
