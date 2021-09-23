package activities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity15 {
	public static String F_N = "resources/TestData.xlsx";

	public static void main(String[] args) throws IOException {
		
		
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet s = wb.createSheet("Type1");
		
		
		Object[][] t = {
			    {"Name"," Class", "Subject"},
			    {"Dipa", 2,"Physics"},
			    {"Trisha", 10, "Chemistry"},
			    {"Payel", 9, "Biology"},
			    {"Neha", 8, "Maths"},
			    {"Asmita", 6, "Social studies"}
			};
		 int r = 0;
	        System.out.println("Creating excel");
	 
	        for (Object[] datatype : t) {
	            Row row = s.createRow(r++);
	            int colNum = 0;
	            for (Object f1: datatype) {
	                Cell cell = row.createCell(colNum++);
	                if (f1 instanceof String) {
	                    cell.setCellValue((String) f1);
	                } else if (f1 instanceof Integer) {
	                    cell.setCellValue((Integer) f1);
	                }
	            }
	        }
	        
	        FileOutputStream output = new FileOutputStream(F_N);
            wb.write(output);
            wb.close();
	 
				System.out.println("Written");
	            
}}