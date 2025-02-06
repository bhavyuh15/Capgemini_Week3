package com.binarysearch;

public class TargetValueIn2D {

    // Method to search for a target value in a 2D sorted matrix using Binary Search
    public static boolean searchMatrix(int[][] matrix, int target) {
        // Handle edge case for empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false; // Return false if matrix is empty
        }

        // Get the number of rows and columns in the matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Treat the 2D matrix as a 1D array
        int left = 0;
        int right = rows * cols - 1;

        // Perform Binary Search on the "flattened" matrix
        while (left <= right) {
            int mid = left + (right - left) / 2; // Find the mid-point

            // Convert mid to row and column indices
            int row = mid / cols;
            int col = mid % cols;

            // Get the element at the calculated row and column
            int midValue = matrix[row][col];

            // Check if the mid-value matches the target
            if (midValue == target) {
                return true; // Target found
            }
            // If mid-value is smaller, search in the right half
            else if (midValue < target) {
                left = mid + 1;
            }
            // If mid-value is larger, search in the left half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, the target was not found
        return false;
    }

    public static void main(String[] args) {

        // Example sorted 2D matrix
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;  // Target value to search
        boolean found = searchMatrix(matrix, target);  // Call search function

        // Output whether the target was found in the matrix
        System.out.println("Target " + target + " found: " + found);
    }
}
