package com.tripillar.filehandling.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelFile {
    public static void main(String[] args) throws IOException {
        // Create a new workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        
        // Create a new sheet
        XSSFSheet sheet = workbook.createSheet("Employee Data");
        
        // Employee data to write to Excel
        Object empdata[][] = {
            {"EmpID", "Name", "Job"},
            {101, "David", "Senior Software Engineer"},
            {102, "Smith", "Junior Software Engineer"},
            {103, "Scott", "Senior Analyst"},
            {104,"Sonan", "Junior Analyst"},
        };
        
        int rows = empdata.length;
        int cols = empdata[0].length;
        
        System.out.println("Rows: " + rows);
        System.out.println("Columns: " + cols);
        
        // Write the data to the sheet
        for (int i = 0; i < rows; i++) {  // Rows start from 0
            XSSFRow row = sheet.createRow(i);
            for (int j = 0; j < cols; j++) {  // Columns start from 0
                XSSFCell cell = row.createCell(j);
                Object value = empdata[i][j];
                
                // Set the cell value based on the type of the object
                if (value instanceof String) {
                    cell.setCellValue((String) value);
                } else if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                } else if (value instanceof Boolean) {
                    cell.setCellValue((Boolean) value);
                }
            }
        }
        
        // Define the file path to write the Excel file
        String filePath = "G:\\Book2.xlsx";
        try (FileOutputStream outstream = new FileOutputStream(filePath)) {
            // Write the workbook to the output stream
            workbook.write(outstream);
        }
        
        // Close the workbook
        workbook.close();
        
        System.out.println("Excel file written successfully!");
    }
}
