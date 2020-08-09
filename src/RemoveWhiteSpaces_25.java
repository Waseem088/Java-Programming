//How to Remove all White Spaces in a String 

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String str="Java    Programming   selenium    automation";
		
		System.out.println("Before removing the whote spaces: "+str);
		
		//using regular expression
		str=str.replaceAll("\\s", ""); //-\\s- matching with the spaces(or representing the spaces)
		
		System.out.println("After removing the whote spaces: "+str);

	}

}
