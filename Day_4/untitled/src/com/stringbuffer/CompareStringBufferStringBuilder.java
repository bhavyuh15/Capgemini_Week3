package com.stringbuffer;

public class CompareStringBufferStringBuilder {

    // Method to measure time taken by StringBuffer for string concatenation
    public static long bufferConcatenate() {
        StringBuffer strBuffer = new StringBuffer(); // Using StringBuffer (thread-safe)
        long start = System.nanoTime(); // Capture start time

        // Append "Hello" 1,000,000 times
        for (int i = 0; i < 1000000; i++) {
            strBuffer.append("Hello");
        }

        return System.nanoTime() - start; // Calculate and return execution time
    }

    // Method to measure time taken by StringBuilder for string concatenation
    public static long builderConcatenate() {
        StringBuilder strBuilder = new StringBuilder(); // Using StringBuilder (not thread-safe, faster)
        long start = System.nanoTime(); // Capture start time

        // Append "Hello" 1,000,000 times
        for (int i = 0; i < 1000000; i++) {
            strBuilder.append("Hello");
        }

        return System.nanoTime() - start; // Calculate and return execution time
    }

    public static void main(String[] args) {
        long timeForStringBuffer = bufferConcatenate(); // Measure time for StringBuffer
        long timeForStringBuilder = builderConcatenate(); // Measure time for StringBuilder

        // Print execution times
        System.out.println("Time taken by StringBuffer: " + timeForStringBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeForStringBuilder + " ns");

        // Compare and determine which one is faster
        if (timeForStringBuffer > timeForStringBuilder) {
            System.out.println("StringBuffer takes more time compared to StringBuilder");
        } else {
            System.out.println("StringBuilder takes more time compared to StringBuffer");
        }
    }
}
