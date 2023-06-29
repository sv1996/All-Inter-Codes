package Codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionImpl {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Shivam");
        myList.add("Vishwakarma");
        myList.add("Karma");
        for (String str:myList)
        {
            System.out.println(str);
        }
        myList.remove("Karma");
        System.out.println(myList);
        Set<Integer> mySet = new HashSet<>();
    }
}
