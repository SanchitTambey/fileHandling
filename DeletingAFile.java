package fileHandling;

import java.io.File;

public class DeletingAFile {

	public static void main(String[] args) 
	{
		File myFile = new File("FileByJava.txt");
		if(myFile.delete()) 
		{
			System.out.println("File Deleted Succesfully");
		}
		else 
		{
			System.out.println("Error in Deleting");
		}

	}

}
