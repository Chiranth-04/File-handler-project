package com.tripillar.filehandling.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String filePath = "Your .txt file path"; 
        String[] content = {
            "This is the first line.",
            "This is the second line.",
            "This is the third line."
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : content) {
                bw.write(line);
                bw.newLine(); 
            }
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();  
        }
    }
}

