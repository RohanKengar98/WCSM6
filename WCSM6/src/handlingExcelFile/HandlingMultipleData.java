package handlingExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream fis=new FileInputStream("./data/TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("City");
		int rowCount = sh.getLastRowNum();
		for(int i=0;i<=rowCount; i++)
		{
		Row row = sh.getRow(i);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
        System.out.println(value);   
	    }
		
	}

}
