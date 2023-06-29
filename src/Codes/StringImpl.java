package Codes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringImpl {
    public static void main(String[] args) {
        String str = "Shivam";
        str.concat("vish");
        System.out.println(str);
        StringBuilder sb = new StringBuilder("ShivamVishwakarma");
        sb.append("123");
        System.out.println(sb);
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        List<Integer>  newAl =addNumbers(al);
        newAl.forEach(System.out::println);
        System.out.println(al);
    }

    private static List<Integer> addNumbers(List<Integer> al) {
           al.add(4);
          return al;
    }

}
