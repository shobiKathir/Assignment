package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public String[][] callData() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		int cellCount = sheet.getRow(0).getLastCellNum();
		
		String [][] input = new String [rowCount][cellCount];
		
		
		for(int i=0;i<=rowCount;i++) {
		
			for(int j=0;j<cellCount;j++) {
				
				/*XSSFRow row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);*/
				String cellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				//System.out.println(cellValue);
				
				input [i-1][j] = cellValue;
			}
			System.out.println();
	}
		wb.close();
		return input;
		
}}
