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

public class WriteTheDataToExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);//MAke the excel file ready for read
		Sheet sh = wb.getSheet("City");//go to the sheet
		Row row = sh.getRow(0);//go to the row
		
		Cell cell = row.createCell(1);//make the cell ready for write operation(i.e. it'll clear the existing data and update new
		cell.setCellValue("rohan");//Set(update) the cell data
		
		FileOutputStream fos=new FileOutputStream("./data/TestData1.xlsx");
		wb.write(fos);//write the data
		wb.close();

	}

}
