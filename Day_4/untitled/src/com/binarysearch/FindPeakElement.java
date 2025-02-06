package com.binarysearch;

public class FindPeakElement {
    // Method to find a peak element index
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        // Handle edge case: Single element
        if (arr.length == 1) {
            return 0;
        }

        // Check if the first element is a peak
        if (arr[0] > arr[1]) {
            return 0;
        }

        // Check if the last element is a peak
        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr.length - 1;
        }


        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than next element, peak is on the left
            if (arr[mid] > arr[mid + 1]) {
                right = mid; // Move left to find the peak
            } else {
                left = mid + 1; // Move right
            }
        }

        return left; // Peak element index
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 45, 4, 1, 0, 90};

        int peakIndex = findPeakElement(arr); // Calling method
        System.out.println("Peak element found at index: " + peakIndex);
        System.out.println("Peak element: " + arr[peakIndex]);
    }
}
