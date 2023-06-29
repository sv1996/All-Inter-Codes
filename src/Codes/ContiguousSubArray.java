package Codes;

import java.util.HashMap;
import java.util.Scanner;

public class ContiguousSubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int m = s.nextInt();
        int ans = maximumNumberOFContiguousSubArray(arr, n, m);
        System.out.println("Total Number of UniqueSuArray" + ans);
    }

    private static int maximumNumberOFContiguousSubArray(int[] arr, int n, int m) {
        int maxUnique = 0;
        for (int i = 0; i < n - m; i++)
        {
            int currentUnique = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < i + n; j++) {
                if (!map.containsKey(arr[j])) {
                    map.put(arr[i], 1);
                    currentUnique++;
                }
            }
            if (currentUnique > maxUnique) {
                maxUnique = currentUnique;
            }

        }
        return maxUnique;
    }
}
