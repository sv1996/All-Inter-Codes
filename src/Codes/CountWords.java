package Codes;

import java.util.Objects;

public class CountWords {
    public static void main(String[] args) {
        String str1 = "Hello I am Shivam Vishwakarma";
        int ans = countNumberOfWords(str1);
        System.out.println("Number of Words is " + ans);
        String str =new String("abc");
        String str2= "abc";
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
    }
    private static int countNumberOfWords(String str) {
        if(Objects.isNull(str))
        {
            return -1;
        }
        String [] newStr=  str.split(" ");
        int count =0;
        for (int i = 0; i < newStr.length; i++) {
            count++;
        }
        return count;
    }
}
