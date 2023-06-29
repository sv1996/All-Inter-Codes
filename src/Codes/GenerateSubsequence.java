package Codes;

import java.util.ArrayList;
import java.util.List;

public class GenerateSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        List<String> subsequences = generateSubsequences(str);
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }

    private static List<String> generateSubsequences(String str) {
        List<String> subsequences = new ArrayList<>();
        int n = str.length();
        // Loop through all possible lengths of subsequences
        for (int len = 1; len <= n; len++) {
            // Loop through all possible starting positions
            for (int start = 0; start <= n - len; start++) {
                int end = start + len;
                String subsequence = str.substring(start, end);
                subsequences.add(subsequence);
            }
        }

        return subsequences;
    }
}

