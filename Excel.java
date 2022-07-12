package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook WB = new XSSFWorkbook("./data/CreateLead.xlsx");
				
		XSSFSheet WS = WB.getSheet("Sheet1");
		
		int Rownum = WS.getLastRowNum();
		
		short cellNum = WS.getRow(0).getLastCellNum();
		
		for(int i=1;i<=Rownum;i++) {
			
			for(int j=0;j<cellNum;j++) {
				
				String data = WS.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println(data);
			}
		}
		
		
		
	}

}
