package Codes;

import javax.swing.*;

public class SecondLargestImpl {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        // int ans = secondLargestUsingNormalMethod(arr);
        int ans = secondLargestUsingSingleTraversal(arr);
        System.out.println("Second Largest Element Is " + ans);
    }

    private static int secondLargestUsingSingleTraversal(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int largest, secondLargest;
        largest = secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }

            // current arr[i]  is lies in between
            if (arr[i] != largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }
        if (secondLargest == Integer.MIN_VALUE) {
            return -1;
        }
        return secondLargest;
    }

    private static int secondLargestUsingNormalMethod(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int secondLargest = -1;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (largest != arr[i]) {
                secondLargest = Math.max(secondLargest, arr[i]);
            }
        }
        return secondLargest;
    }
}
