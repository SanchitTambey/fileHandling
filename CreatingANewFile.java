package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreatingANewFile 
{
	public static void main(String[] args) 
	{
		File myFile = new File("FileByJava.txt");
		try {
			myFile.createNewFile();
			System.out.println("File Created Successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
