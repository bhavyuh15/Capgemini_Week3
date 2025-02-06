package com.challengeproblem;
import java.util.Arrays;

public class LinearBinarySearch {

    // Method to find the first missing positive integer using linear search
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Mark elements that are out of range or duplicates as a special value
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1; // Special value to ignore out of range numbers
            }
        }

        // Use the values in the array to mark the corresponding indexes as visited
        for (int i = 0; i < n; i++) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        // Now find the first index which is not marked (positive)
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1; // First missing positive integer
            }
        }

        // If all positions are marked, the first missing positive is n+1
        return n + 1;
    }

    // Method to perform binary search to find the index of a given target
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found, return index
            } else if (arr[mid] < target) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1}; // Example list of integers
        int target = 4;

        // Find the first missing positive integer using linear search
        int missingPositive = firstMissingPositive(nums);
        System.out.println("First Missing Positive Integer: " + missingPositive);

        // Sort the array before performing binary search
        Arrays.sort(nums);

        // Find the index of the target number using binary search
        int targetIndex = binarySearch(nums, target);

        if (targetIndex != -1) {
            System.out.println("Target " + target + " found at index: " + targetIndex);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}
