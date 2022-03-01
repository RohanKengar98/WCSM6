package writeTheDataToExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLibraryToWriteTheData {
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

}
