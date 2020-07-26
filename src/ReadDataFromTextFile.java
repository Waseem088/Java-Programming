//How to Read Data from Text file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
	
		//Approach1: Using FileReader, BufferReader
		
	/*	FileReader fr=new FileReader("C:\\Users\\sesa440442\\eclipse-workspace\\Text.txt");
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str =br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close(); */
		
		//Approach3: Using Scanner & File
		
	/*	File file=new File("C:\\\\Users\\\\sesa440442\\\\eclipse-workspace\\\\Text.txt");
		
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) //boolean
		{
			System.out.println(sc.nextLine());
		} */
		
		//Approach3: 
		
        File file=new File("C:\\\\Users\\\\sesa440442\\\\eclipse-workspace\\\\Text.txt");
		
		Scanner sc=new Scanner(file);
		
		sc.useDelimiter("\\Z"); // \\Z-will match each and every line in the notepad
		System.out.println(sc.next());
		

	}

}
