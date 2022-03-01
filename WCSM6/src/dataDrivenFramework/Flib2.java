package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib2 {
	//Generic Reusable Method to read excel data
	
	public String readExcelData(String excelPath, String sheetName, int rowCount, int cellCount ) throws IOException {
		
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String value = cell.getStringCellValue();
		return value;
	}
	//To get the rowCount
    public int getRowCount(String excelPath, String sheetName ) throws IOException {
		
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		int rc = sh.getLastRowNum();
		return rc;
    }
  //Generic Reusable method to write the data in excel
  	public void main(String excelPath, String sheetName, int rowCount, String data) throws EncryptedDocumentException, IOException {
  	
  		FileInputStream fis=new FileInputStream(excelPath);
  		Workbook wb = WorkbookFactory.create(fis);//MAke the excel file ready for read
  		Sheet sh = wb.getSheet(sheetName);//go to the sheet
  		Row row = sh.getRow(rowCount);//go to the row
  		Cell cell = row.createCell(rowCount);
  		cell.setCellValue(data);
  		
  		FileOutputStream fos = new FileOutputStream(excelPath);
  		wb.write(fos);
  	}
  	//Generic Reusable method to read the property file
	public String main(String propertyFilePath, String key) throws IOException {
		
		FileInputStream fis=new FileInputStream(propertyFilePath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}

}