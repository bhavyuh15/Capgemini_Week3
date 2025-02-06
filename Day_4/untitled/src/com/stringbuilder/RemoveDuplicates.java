package com.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String remove(String str) {
        StringBuilder strBuilder = new StringBuilder(); // To store unique characters
        HashSet<Character> set = new HashSet<>(); // HashSet to track seen characters

        // Iterate through each character
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) { // Check if character is already added
                strBuilder.append(ch); // Append unique character
                set.add(ch); // Mark character as seen
            }
        }


        return strBuilder.toString(); // Return string without duplicates
    }

    public static void main(String[] args) {
        String str = "sarvesh";
        String ans = remove(str); // Call remove method
        System.out.println(ans);
    }
}
