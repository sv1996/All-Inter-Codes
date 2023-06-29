package ArrayImpl;

import jdk.swing.interop.SwingInterOpUtils;

public class NextGreaterElement {
    public static void main(String[] args) {
        /*

       Input: arr[] = [ 4 , 5 , 2 , 25 ]
Output:         4      –>   5
               5      –>   25
               2      –>   25
              25     –>   -1
         */

        int arr[] = {4, 5, 2, 25};
        nextGreaterElement(arr);
    }

    private static void nextGreaterElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int next = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }

            System.out.println("Next Greater Element of " + arr[i] + " is->" + next);

        }


    }
}
