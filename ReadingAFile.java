package fileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadingAFile 
{
	public static void main(String[] args) 
	{
		File myFile = new File("FileByJava.txt");
		try {
		Scanner sc =new Scanner(myFile);
		while(sc.hasNextLine()) 
		{
			String Line =sc.nextLine();
			System.out.println(Line);
		}
		sc.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
