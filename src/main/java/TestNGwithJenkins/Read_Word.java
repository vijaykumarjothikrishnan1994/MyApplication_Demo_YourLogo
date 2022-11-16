package TestNGwithJenkins;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Read_Word {
	
	@Test
	public static void Wordfile() throws FileNotFoundException {
		File file=new File("E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\TestAutomation_All_Scenarios\\Master_Test_Data\\Read_Word.docx");

		
		//FileReader read_file=new FileReader(file);
		
		Scanner sc=new Scanner(file);
		
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
	}
	
	
}
