package StringCodes;

public class StringReverseImpl {
    public static void main(String[] args) {
        String str = "Shivam Vishwakarma";
//        String ans = reverseStringRecursive(str);
//        System.out.println("Reversal of string is " + ans);
       str = reverseStringUsingLoops(str);
        System.out.println(str);

    }

    private static String reverseStringUsingLoops(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = str.charAt(left);
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;

        }
        return new String(charArray);

    }

    private static String reverseStringRecursive(String str) {
        // base case
        if (str.isEmpty()) {
            return str;
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);

    }
}
