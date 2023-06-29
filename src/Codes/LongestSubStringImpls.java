package Codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubStringImpls {
    /*
0 find the length of the longest substring without repeating characters in a given string.
abcabcbb
abc = 3
     */
    public static void main(String[] args) {
        String str = "abcabcbb";
         int ans =  maxSubString(str);
        System.out.println("Ans is " + ans);


    }

    private static int maxSubString(String str) {
        int n =str.length();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++) {
            for (int j=i;j<n;j++)
            {
                boolean unique =checkUnique(str.substring(i,j));
               if(unique)
               {
                   max =Math.max(max,str.substring(i,j).length());

               }
            }

        }

       return max;

    }

    private static boolean checkUnique(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        return set.size() == str.length();
     }
}
