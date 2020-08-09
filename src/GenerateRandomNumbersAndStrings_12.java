import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		
		//Approach1 - Random
		
	//	Random rand=new Random();
	//	int rand_int=rand.nextInt(10); //it will generate random values from 0-9.
	//	System.out.println(rand_int);
		
	//	double rand_dbl=rand.nextDouble(); //range 0.0 and less than 1.0 will generate random decimal numbers.
	//	System.out.println(rand_dbl);

	// Approach2 - Math
//	System.out.println(Math.random());	
	
	//Approach3 - Apache commons-lang API(basically this APi is provided to generate random Numbers as well as Strings both can generate)
	//will use most of the time in java projects
	//go to this(https://commons.apache.org/proper/commons-lang/download_lang.cgi) link and download(commons-lang3-3.11-bin.zip file)
	//add only commons-lang3-3.11.jar to build path
	
	//String randNum=RandomStringUtils.randomNumeric(5);  //RandomStringUtils - comming from the jar class and 5 ->will give random 5 digit numbers
	//System.out.println(randNum);
	
	String randStr=RandomStringUtils.randomAlphabetic(10);
	System.out.println(randStr);
	
	}

}
