package com.binarysearch;

public class FindRotationPoint {
    // Method to find the index of the smallest element
    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        // If array is already sorted and not rotated
        if (arr[left] < arr[right]) {
            return 0; // First element is the smallest
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element, search in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            }
            // search in the left half
            else {
                right = mid;
            }
        }
        return left; // Left will point to the smallest element
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3}; // Rotated sorted array

        int rotationIndex = findRotationPoint(arr);
        System.out.println("Rotation point (smallest element) found at index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }
}
