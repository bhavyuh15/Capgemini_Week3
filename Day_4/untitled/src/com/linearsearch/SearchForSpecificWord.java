package com.linearsearch;

import java.util.Scanner;

public class SearchForSpecificWord {

    // Method to search for a specific word in an array of strings
    public static void searchSpecificWord(String inputWord) {
        // Array containing sample strings
        String[] strArr = { "yo yo honey", "you are the best", "rapper in whole industry" };

        // Loop through each string in the array
        for (String str : strArr) {
            // Split the string into words and check each word
            for (String s : str.split(" ")) {
                // If the word matches, print the full string and return
                if (s.equalsIgnoreCase(inputWord)) {
                    System.out.println(str);
                    return;  // Exit the function after finding the word
                }
            }
        }
        // If the word is not found in any string
        System.out.println("Not Found!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Creating Scanner object for input

        System.out.println("Enter the word to search: ");
        String inputWord = input.nextLine();  // Reading user input

        searchSpecificWord(inputWord);  // Calling the search function

        input.close();  // Closing Scanner
    }
}
