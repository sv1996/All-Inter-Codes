package Codes;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String s = "cbbd";
        String string = longestPalindromicSubstring(s);
        System.out.println(string);
    }

    private static String longestPalindromicSubstring(String s) {
        // generate Substring
        String ans = null;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                boolean isPalindrome = checkSubStringIsPalindrome(s.substring(i, j));
                if (isPalindrome) {
                    String str = s.substring(i, j);
                    if (str.length() > max) {
                        max = str.length();
                        ans = str;
                    }
                }
            }
        }
        return ans;
    }

    private static boolean checkSubStringIsPalindrome(String str) {
        int startIndex = 0;
        int lastIndex = str.length() - 1;
        while (startIndex < lastIndex) {
            if (str.charAt(startIndex) != str.charAt(lastIndex)) {
                return false;
            }
            startIndex++;
            lastIndex--;
        }

        return true;
    }
}
