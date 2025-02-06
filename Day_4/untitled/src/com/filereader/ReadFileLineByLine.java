package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        try {
            // Specify the file path to be read
            FileReader file = new FileReader("C:\\Users\\sarve\\Desktop\\week 3 pr\\Day_4\\untitled\\src\\com\\filereader\\Problem1file.txt");

            // Use BufferedReader to read the file efficiently
            BufferedReader br = new BufferedReader(file);

            String line;
            // Read the file line by line until the end of the file is reached
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line
            }

            // Close the BufferedReader
            br.close();
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions (file not found, read error, etc.)
        }
    }
}
