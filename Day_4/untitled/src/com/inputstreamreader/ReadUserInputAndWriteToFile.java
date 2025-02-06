package com.inputstreamreader;

import java.io.*;

public class ReadUserInputAndWriteToFile {
    public static void readAndRightUserInput(){
        try {
            // Create an InputStreamReader to read from the console
            InputStreamReader inputStream = new InputStreamReader(System.in);
            // Wrap InputStreamReader with BufferedReader
            BufferedReader br = new BufferedReader(inputStream);
            // Create a FileWriter to write user input
            FileWriter file = new FileWriter("C:\\Users\\sarve\\Desktop\\week 3 pr\\Day_4\\untitled\\src\\com\\inputstreamreader\\inputstreamfile.txt");

            // Variable to hold user input
            String userInput = "";
            // Continuously read user input until "exit" is typed
            while (!userInput.equals("exit")) {
                // Read a line of input from the console
                userInput = br.readLine();
                // Write the user input to the file with a newline
                file.write(userInput + "\n");
            }
            // Close the file writer to save the changes
            file.close();

            br.close();
        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
    public static void main(String[] args)  {
       readAndRightUserInput(); // calling method
    }
}
