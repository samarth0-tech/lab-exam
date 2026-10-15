package com.exam;

public class LabUtils {
    
    // Method to find the largest of three numbers
    public static int findLargest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}