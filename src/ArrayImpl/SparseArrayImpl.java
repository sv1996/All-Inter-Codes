package ArrayImpl;

import java.util.*;

public class SparseArrayImpl {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queriesList = Arrays.asList("aba", "xzxb", "ab");
        // ans[] =2,1,0
        List<Integer> ans = matchingStrings(stringList, queriesList);
        System.out.println(ans);

    }


    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> list = new ArrayList<>();
        for (String s : queries) {
            int count = Collections.frequency(stringList, s);
            list.add(count);
        }

        return list;
    }


}