package com.binarysearch;

public class FirstLastOccurrence {

    // Method to find the first occurrence of a target element in a sorted array
    public static int firstOcc(int[] arr, int target) {
        int left = 0;
        int n = arr.length;
        int right = n - 1;
        int result = -1; // Variable to store the first occurrence index

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;  // Update result when target is found
                right = mid - 1; // Move left to search for the first occurrence
            } else if (arr[mid] < target) {
                left = mid + 1; // Move right if target is greater
            } else {
                right = mid - 1; // Move left if target is smaller
            }
        }
        return result; // Return the first occurrence index or -1 if not found
    }

    // Method to find the last occurrence of a target element in a sorted array
    public static int lastOcc(int[] arr, int target) {
        int left = 0;
        int n = arr.length;
        int right = n - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Calculate mid to avoid integer overflow

            if (arr[mid] == target) {
                result = mid; // Update result when target is found
                left = mid + 1; // Move right to search for the last occurrence
            } else if (arr[mid] < target) {
                left = mid + 1; // Move right if target is greater
            } else {
                right = mid - 1; // Move left if target is smaller
            }
        }
        return result; // Return the last occurrence index or -1 if not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 4, 5, 6, 7}; // Sorted array
        int target = 2; // Target element to find

        int firstOcc = firstOcc(arr, target); // Get first occurrence index
        int lastOcc = lastOcc(arr, target); // Get last occurrence index

        System.out.println("First Occurrence of target element " + target + " is: " + firstOcc);
        System.out.println("Last Occurrence of target element " + target + " is: " + lastOcc);
    }
}
