package Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamImpl {
    public static void main(String[] args) {
        int array[] = {1, 3, 2, 5, 7, 8, 10};
//        Predicate<Integer> p = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//
//            }
//        }
        
        List<Integer> al = new ArrayList<>(array.length);
        for (int i = 0; i < array.length; i++) {
            al.add(array[i]);
        }
         al.stream().filter(a -> a % 2 == 0).forEach(System.out::print);

    }
}