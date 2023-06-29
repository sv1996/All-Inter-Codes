package Codes;

import java.util.Stack;

public class RearrangeAlternate {
    public static void main(String[] args) {
        //    Input:  arr[] = {1, 2, 3, -4, -1, 4}
        //      Output: arr[] = {-4, 1, -1, 2, 3, 4}

        int arr[] = {1, 2, 3, -4, -1, 4};
        reaggarmge(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
    }

    private static void reaggarmge(int[] arr) {
        Stack<Integer> positives = new Stack<>();
        Stack<Integer> negatives = new Stack<>();

        // partition the array into two halves
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positives.push(arr[i]);
            } else {
                negatives.push(arr[i]);
            }
        }
        boolean isPositive = true;
        while (!positives.isEmpty() && !negatives.isEmpty()) {
            if (isPositive) {
                System.out.print(positives.pop() + " ");
            } else {
                System.out.print(negatives.pop() + " ");
            }
            isPositive = !isPositive;
        }

        // print remaining elements
        while (!positives.isEmpty()) {
            System.out.print(positives.pop() + " ");
        }
        while (!negatives.isEmpty()) {
            System.out.print(negatives.pop() + " ");
        }
    }
//        Stack<Integer> stPos = new Stack<>();
//        Stack<Integer> stNeg = new Stack<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 0) {
//                stNeg.push(arr[i]);
//            } else {
//                stPos.push(arr[i]);
//            }
//        }
//
//        System.out.println(stPos);
//        System.out.println(stNeg);
//        int i = 0;
//        while (i < arr.length && !stPos.isEmpty() && !stNeg.isEmpty()) {
//            if (i % 2 == 0) {
//                arr[i] = stPos.pop();
//            } else {
//                arr[i] = stNeg.pop();
//            }
//            i++;
//        }
//
//        while (!stPos.isEmpty()) {
//            arr[i] = stPos.pop();
//            i++;
//        }
//
//
//        while (!stNeg.isEmpty()) {
//            arr[i] = stNeg.pop();
//            i++;
//        }


    }

