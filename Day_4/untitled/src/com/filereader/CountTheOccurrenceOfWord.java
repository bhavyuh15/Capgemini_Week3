package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountTheOccurrenceOfWord {

    // Method to count the occurrences of a target word in the file
    public static int countOccurrence(String target) {
        int count = 0; // Variable to store the count of occurrences

        try {
            // Open the file to read
            FileReader file = new FileReader("C:\\Users\\sarve\\Desktop\\week 3 pr\\Day_4\\untitled\\src\\com\\filereader\\Problem1file.txt");
            BufferedReader br = new BufferedReader(file); //BufferedReader

            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split each line into words and check if each word matches the target
                for (String str : line.split(" ")) {
                    // Compare words case-insensitively
                    if (str.equalsIgnoreCase(target)) {
                        count++; // Increment the count for each match
                    }
                }
            }
            br.close(); // Close the BufferedReader

        } catch (IOException e) {
            e.printStackTrace(); // Handle exceptions if the file is not found
        }

        return count; // Return the total count of occurrences
    }

    public static void main(String[] args) {
        String target = "my"; // The target word

        // Call the method to count the occurrences of the target word
        int count = countOccurrence(target);

        // Print the result to the console
        System.out.println("Number of target string: [" + target + "] present in String is: " + count);
    }
}
