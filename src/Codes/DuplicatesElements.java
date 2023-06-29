package Codes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesElements {
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,4,5,6};
        Set<Integer> set = new HashSet<>();
        Set<Integer> newHset = new HashSet<>();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.add(arr[i])){
                newHset.add(arr[i]);
            }
        }

newHset.forEach(l-> System.out.println(l));
    }
}
