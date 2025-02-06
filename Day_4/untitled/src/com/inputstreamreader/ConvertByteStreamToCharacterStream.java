package com.inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteStreamToCharacterStream {

    // Method to convert byte stream to character stream and read file content
    public static void byteToCharacterStream() {
        try {
            //file as a byte stream
            FileInputStream fileInput = new FileInputStream("C:\\Users\\sarve\\Desktop\\week 3 pr\\Day_4\\untitled\\src\\com\\inputstreamreader\\inputstreamfile.txt");

            // Convert byte stream to character stream
            InputStreamReader inputStream = new InputStreamReader(fileInput);
            BufferedReader br = new BufferedReader(inputStream);

            // Read and print file content line by line
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            br.close();
            inputStream.close();
            fileInput.close();

        } catch (IOException e) {
            e.printStackTrace(); // Handle file-related exceptions
        }
    }

    public static void main(String[] args) {
        byteToCharacterStream(); // Call method to read file
    }
}
