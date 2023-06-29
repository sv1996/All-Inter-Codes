package Codes;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Largest {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
         maxSumSubArray(arr);
        System.out.println("Maximum Sum SubArray ");
        List<String> al = Arrays.asList("SHIVAM", "VISHWAKARMA");
        al.stream().map(a->a.toLowerCase()).collect(Collectors.toList());
        al.forEach(a-> System.out.println(a));
    }

    private static void maxSumSubArray(int[] arr) {
        int length = arr.length;
        int max = 0;
        int maxTillIndex = arr[0];



    }
}


