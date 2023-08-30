package com.AppDemo.DemoAmazon;

import java.io.File;
import java.io.File.*;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Datatable2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File file= new File("C:\\Users\\deedhole\\eclipse-workspace\\DemoAmazon\\ExcelData\\data1.xlsx");
		
		// read the data into excel sheet
		FileInputStream fos= new FileInputStream(file);
		
		Workbook w= new XSSFWorkbook(fos);
		
		Sheet s=w.getSheetAt(0);
		
		int row=s.getLastRowNum();
		int col=s.getRow(1).getLastCellNum();
		
		for(int r=0;r<=row;r++)
		{
			Row ro=s.getRow(r);
			for(int c=0;c<col;c++)
			{
				Cell ce=ro.getCell(c);
				
				switch(ce.getCellType())
				{
				case STRING: System.out.print(ce.getStringCellValue());
				break;
				case NUMERIC: System.out.print(ce.getNumericCellValue());
				break;
				case BOOLEAN: System.out.print(ce.getBooleanCellValue());
				break;
				default:
					break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}
		
		
	
		
		w.close();
		fos.close();
		
		
		
		
		
	}

}
