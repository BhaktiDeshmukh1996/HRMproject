package TestUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFiles {

	static String Data;
	public static String fetchDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException 
	{	
		String path="C:\\Users\\family\\eclipse-workspace\\Maven_OrangeHRM\\src\\test\\resources\\Files\\bs17sheet.xlsx";
		FileInputStream file=new FileInputStream(path);

		Cell c=WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell);
		CellType type=c.getCellType();
		if(type==CellType.STRING)
		{
			Data=c.getStringCellValue();
		}
		else if(type==CellType.NUMERIC)
		{
			double d=c.getNumericCellValue();
			Data=Double.toString(d); 
		}
		else if(type==CellType.BLANK)
		{
			System.out.println("You are trying to fetch empty cell");
		}
		
		return Data;
				
		
	}
}
