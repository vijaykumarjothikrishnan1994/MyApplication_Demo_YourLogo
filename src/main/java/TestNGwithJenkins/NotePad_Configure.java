package TestNGwithJenkins;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class NotePad_Configure {
	
	@Test
	public static void Excel_Configure_TestData() throws FileNotFoundException {
		
		File file=new File("C:\\Users\\Vijay\\Desktop\\TestFiles\\myTest.text");
		
		//XSSFWorkbook xp=new XSSFWorkbook();
		
		Scanner sc=new Scanner(file);
		
		
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
		
	}

}
