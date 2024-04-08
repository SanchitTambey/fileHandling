package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WritingAFile 
{
	public static void main(String[] args) {
		
		
		try {
			FileWriter fileWriter =new FileWriter("FileByJava.txt");
			fileWriter.write("Hello Wellcome to the FileByJava \nOkay byee!!!");
			System.out.println("Written Succesfully");
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
