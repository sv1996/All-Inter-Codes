package java8.Java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindElement {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        sum(al);
        System.out.println(al.size());

    }

    private static void sum(List<Integer> al) {
        al.remove(0);
        int sum =0;
        for (Integer a: al ) {
            sum = sum + a;
        }
        System.out.println(sum);
    }
}
