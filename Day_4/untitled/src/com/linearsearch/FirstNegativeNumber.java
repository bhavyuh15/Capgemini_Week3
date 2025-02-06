package com.linearsearch;

public class FirstNegativeNumber {
    // Method to find the index of the first negative number
    public static int findFirstNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is negative
            if (arr[i] < 0) {
                return i; // Return the index of the first negative number
            }
        }
        return -1; // Return -1 if no negative number
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, -2, 9, -5, 8};

        // Call the method and store the result
        int result = findFirstNegative(numbers);


        if (result != -1) {
            System.out.println("First negative number found at index: " + result);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
