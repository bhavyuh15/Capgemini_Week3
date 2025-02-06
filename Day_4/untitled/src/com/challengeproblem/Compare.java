package com.challengeproblem;

import java.io.*;

public class Compare {
    // Method to measure time taken by StringBuffer
    public static long bufferConcatenate() {
        StringBuffer strBuffer = new StringBuffer(); // Using StringBuffer
        long start = System.nanoTime(); // Capture start time

        // Append "Hello" 1,000,000 times
        for (int i = 0; i < 1000000; i++) {
            strBuffer.append("Hello");
        }

        return System.nanoTime() - start; // Calculate and return execution time
    }

    // Method to measure time taken by StringBuilder
    public static long builderConcatenate() {
        StringBuilder strBuilder = new StringBuilder(); // Using StringBuilder
        long start = System.nanoTime(); // Capture start time

        // Append "Hello" 1,000,000 times
        for (int i = 0; i < 1000000; i++) {
            strBuilder.append("Hello");
        }

        return System.nanoTime() - start; // Calculate and return execution time
    }

    // Method to read a file using FileReader and count the number of words
    public static long fileReader() {
        int count = 0; // Variable to count words
        long start = System.nanoTime(); // Capture start time

        try {
            // Specify the file path to be read
            FileReader file = new FileReader("C:\\Users\\sarve\\Desktop\\week 3 pr\\Day_4\\untitled\\src\\com\\challengeproblem\\Challengeproblemfile.txt");

            // Use BufferedReader to read the file
            BufferedReader br = new BufferedReader(file);

            String line;
            // Read the file line by line until the end of the file is reached
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Print each line
                count += line.split(" ").length; // Count words in each line
            }

            // Close
            br.close();
        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions
        }

        System.out.println("Total word count using FileReader: " + count);
        return System.nanoTime() - start; // Return execution time
    }

    // Method to read a file using InputStreamReader and count the number of words
    public static long inputStreamReader() {
        long start = System.nanoTime(); // Capture start time
        int count = 0; // Variable to count words

        try {
            // Read file as a byte stream
            FileInputStream fileInput = new FileInputStream("C:\\Users\\sarve\\Desktop\\week 3 pr\\Day_4\\untitled\\src\\com\\challengeproblem\\Challengeproblemfile.txt");

            // Convert byte stream to character stream
            InputStreamReader inputStream = new InputStreamReader(fileInput);
            BufferedReader br = new BufferedReader(inputStream);

            // Read and print file content line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count += line.split(" ").length; // Count words in each line
            }

            // Close
            br.close();
            inputStream.close();
            fileInput.close();

        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions
        }

        System.out.println("Total word count using InputStreamReader: " + count);
        return System.nanoTime() - start; // Return execution time
    }

    public static void main(String[] args) {
        // Compare file reading methods
        long fileReaderTime = fileReader();
        long inputStreamTime = inputStreamReader();

        // Compare FileReader vs InputStream performance
        if (fileReaderTime > inputStreamTime) {
            System.out.println("InputStreamReader is faster compared to FileReader.");
        } else {
            System.out.println("FileReader is faster compared to InputStreamReader.");
        }

        // Compare StringBuffer vs StringBuilder performance
        long builderTime = builderConcatenate();
        long bufferTime = bufferConcatenate();

        if (builderTime < bufferTime) {
            System.out.println("StringBuilder is faster compared to StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster compared to StringBuilder.");
        }
    }
}
