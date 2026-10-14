package com.exam;

public class LabUtils {
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }
}