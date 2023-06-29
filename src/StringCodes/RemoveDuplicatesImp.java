package StringCodes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesImp {
    public static void main(String[] args) {
        String str = "aabbccdert";
        removeDuplicates(str);
    }

    private static void removeDuplicates(String str) {
        // char ch [] = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (Character c1 : str.toCharArray()) {
            set.add(c1);
        }

        for (Character c : set) {
            System.out.println(c);
        }


    }
}
