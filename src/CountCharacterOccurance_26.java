//Hoe to Count Occurrences of a Character in a String
public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s="Java Programming Java oops"; //want to find out - how many times this(a) is repeated in a string
		
		int totalcount=s.length(); //total length of a string
		
		int totalcount_afterRemove=s.replace("a", "").length(); //replace(oldChar, newChar) // total length after removing a's.
		
		int count=totalcount-totalcount_afterRemove;
		
		System.out.println("Number of occurence of a is: "+count);
	}

}
