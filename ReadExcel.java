package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[] [] Readdata(String filename) throws Exception {
		// TODO Auto-generated method stub

	   //Setup the path for the workBook
		
		XSSFWorkbook WB= new XSSFWorkbook("./data/"+filename+".xlsx");
		
		// Get into the respective sheet
		
		XSSFSheet ws = WB.getSheet("Sheet1");
		
		// To get No of Rows(Exclude Header)
		
		int rowcount = ws.getLastRowNum();
		
		// To get no of  rows including header
		
		//int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		
		//System.out.println(physicalNumberOfRows);
		
		//System.out.println(lastRowNum);
		
		// To get No of Cells
		
		short cellcount = ws.getRow(0).getLastCellNum();
		
		
		
		String [][] data= new String[rowcount][cellcount];
		
		for(int i=1; i<=rowcount;i++) {
			
			for(int j=0; j<cellcount;j++) {
				
				data[i-1][j] = ws.getRow(i).getCell(j).getStringCellValue();
				
			
			}
		}
		
		// Get into Respective Row
		
		//XSSFRow row = ws.getRow(2);
		
		// Get into the respective cell
		
		//XSSFCell cell = row.getCell(0);
		
		//Read the data from the cell
		
		//String data = cell.getStringCellValue();
		
		//System.out.println(data);
		
		// close the workbook
		
		
		
		WB.close();
		
		return data;
   }

}
