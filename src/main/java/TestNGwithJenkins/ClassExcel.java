package TestNGwithJenkins;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ClassExcel {
	
	@Test
	public static void Excel_Read() throws IOException {
		
		File file=new File("E:\\Softwares\\Eclipse_Workspace\\BaseWorkspace\\TestAutomation_All_Scenarios\\Master_Test_Data\\Excel_Read_Data.xlsx");
		
		FileInputStream readFile=new FileInputStream(file);
		
		XSSFWorkbook xb=new XSSFWorkbook(readFile);
		XSSFSheet sheet=xb.getSheetAt(0);
		
		int last_row= sheet.getLastRowNum();
		
		
		
		for(int i=0;i<last_row;i++)
		{
	XSSFRow row=  sheet.getRow(i);
	
	int last_colunm=row.getLastCellNum();
	
	for(int j=0;j<last_colunm;j++)
	{
		XSSFCell cell= row.getCell(j);
		
		
		String print_TotalValue=cell.getStringCellValue();
		System.out.println("This is the output Value : "+   print_TotalValue);
	}
	
	System.out.println( );
		}
	}

}
