package com.tripillar.filehandling.text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String filePath = "your .txt file path";  

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);  
            }
        } catch (IOException e) {
            e.printStackTrace();  
        }
    }
}

