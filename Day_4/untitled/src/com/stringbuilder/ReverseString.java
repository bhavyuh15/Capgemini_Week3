package com.stringbuilder;

public class ReverseString {

    // Method to reverse a given string using StringBuilder
    public static String reverse(String str) {
        // Create a StringBuilder object initialized with the input string
        StringBuilder strBuilder = new StringBuilder(str);

        // Reverse the string using the built-in reverse() method and return as a string
        return strBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "hello"; // Input string
        String reverseString = reverse(str); // Call the reverse method

        // Print the reversed string
        System.out.println("Reversed String: " + reverseString);
    }
}
