package handlingExcelFile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("./data/TestData1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("City");
		Row row = sh.getRow(7);
		Cell cell = row.getCell(0);
		String value = cell.getStringCellValue();
		System.out.println(value);

	}

}
