package com.stringbuffer;

public class ConcatenateStrings {

    // Method to concatenate an array of strings into a single string
    public static String concatenate(String[] inputStr) {
        StringBuffer strBuffer = new StringBuffer(); // Using StringBuffer

        // Iterate through each string in the array and append it to StringBuffer
        for (String str : inputStr) {
            strBuffer.append(str);
        }

        return strBuffer.toString(); // Convert StringBuffer to String and return
    }

    public static void main(String[] args) {
        String[] inputStr = {"sare", "yoyo", "Honey", "Singh"}; // Input string array
        String ans = concatenate(inputStr); // Call concatenate method
        System.out.println(ans);

    }
}
