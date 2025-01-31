package sorting.countingsort;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Count occurrences of each age
        for (int num : arr) {
            count[num - min]++;
        }

        // Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 14, 11, 15, 13, 10, 18, 17, 16, 12};
        countingSort(studentAges, 10, 18);
        System.out.println("Sorted Student Ages: " + Arrays.toString(studentAges));
    }
}
