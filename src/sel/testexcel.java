package sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testexcel {
	static String uname;
	public static void main(String args[]) throws Exception
	{
		File fil = new File("C:\\Users\\Manjit\\workspace\\sel\\Test Data.xlsx");
		FileInputStream file = new FileInputStream(fil);
		XSSFWorkbook xcel= new XSSFWorkbook(file);
		XSSFSheet sheet = xcel.getSheetAt(0);
		int rowcount = sheet.getLastRowNum();
		ArrayList <String> unamelist = new ArrayList<>();
		
	for(int i=0;i<5;i++)
	{	
			uname = sheet.getRow(i).getCell(0).getStringCellValue();
			unamelist.add(uname);
		
	}	
		 
		System.out.println(unamelist);
	
	}
}
