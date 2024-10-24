package com.tripillar.filehandling.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        // Path to the Excel file
        String path = "Your excel file path"; 

        
        FileInputStream file = new FileInputStream(path);  
        XSSFWorkbook workbook = new XSSFWorkbook(file);   
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        // Get the number of rows and columns
        int rows = sheet.getLastRowNum();
        int col = sheet.getRow(0).getLastCellNum(); // assuming the first row has all columns

        // Iterate over the rows and columns
        for (int i = 0; i <= rows; i++) {
            XSSFRow row = sheet.getRow(i);
            
            // Null check for row
            if (row == null) {
                continue; // Skip if the row is null
            }

            for (int j = 0; j < col; j++) {
                XSSFCell cell = row.getCell(j);

                // Null check for cell
                if (cell == null) {
                    System.out.print(" " + "\t"); 
                    continue; // Skip to the next cell
                }
                
                // Check the cell type and handle accordingly
                switch (cell.getCellType()) {
                    case STRING: 
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC: 
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN: 
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    case BLANK: 
                        System.out.print("BLANK" + "\t");
                        break;
                    default: 
                        System.out.print("Unknown Value" + "\t");
                        break;
                }
            }
            System.out.println(); 
        }

        
        workbook.close();
        file.close();
    }
}
