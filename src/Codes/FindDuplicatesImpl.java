package Codes;

import java.util.HashSet;

public class FindDuplicatesImpl {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 5, 6, 6};
        findDuplicatesInArray(arr);
    }

    private static void findDuplicatesInArray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.print(arr[i] + "->");
            } else {
                set.add(arr[i]);
            }
        }


    }
}
