import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//How to write data into text file
public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\sesa440442\\eclipse-workspace\\Test123.txt");
		
		BufferedWriter bw=new BufferedWriter(fw); //bw is the object which is pointing to the Test123.txt file which is currently empty 
		
		bw.write("Selenium with Java");
		bw.write("Selenium with Python");
		bw.write("Selenium with C#");
		
		System.out.println("Fininshed!!!!");
		
		bw.close();

	}

}
