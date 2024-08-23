package automationPractice.automation;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.xssf.usermodel.XSSFSheet;
public class ExcelReader 

{
	
	String file_path=System.getProperty("user.dir");

	
	public void getAllData() throws IOException
	{
	 File f=new File(file_path+"\\Resource\\TestEmp.xlsx");
	 FileInputStream fis=new FileInputStream(f);
	 XSSFWorkbook workbook=new XSSFWorkbook(fis);
	 XSSFSheet sheet= workbook.getSheet("Emp");
	 int n=sheet.getPhysicalNumberOfRows();
	// System.out.println(n);
	  for(int i=0;i<n;i++)
	  {
		  String label=sheet.getRow(i).getCell(0).getStringCellValue();
		  String value=sheet.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(label+":"+value);
		  
	  }
	 
	}
	public void readData() throws IOException
	{
		File f=new File(file_path+"\\Resource\\TestEmp.xlsx");
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("EmpData");
		
		System.out.println(sheet.getPhysicalNumberOfRows());
		System.out.println(sheet.getLastRowNum());
		
		
	}

	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelReader e=new ExcelReader();
		e.getAllData();
		e.readData();

	}

}
