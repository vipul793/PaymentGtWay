package com.Utility;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) {
		
		try {
			XSSFWorkbook wb = new XSSFWorkbook("C:\\Users\\Vipul\\Desktop\\signUp.xlsx");
			XSSFSheet sheet = wb.getSheet("Details");
			
			int row = sheet.getLastRowNum();
			int cell = sheet.getRow(1).getLastCellNum();
			
			DataFormatter format = new DataFormatter();
			
			
			for (int i = 1; i <= row; i++) {
				
				for (int j = 0; j <=cell; j++) {
					String data = format.formatCellValue(sheet.getRow(i).getCell(j));
					System.out.print(data+" ");
					
				}
				System.out.println();
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
