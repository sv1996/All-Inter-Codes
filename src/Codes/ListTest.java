package Codes;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("Shivam");
        al.add("Dhar");
        addAllList(al);
        al.forEach(a-> System.out.print(a));
     }

    private static void addAllList(List<String> al) {
         al.add(0,"Rohan");
         al.add("Nisha");
    }
}
