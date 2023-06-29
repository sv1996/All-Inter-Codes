package java8.Java8Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Zwayam");
        fruits.add("Oranges");
        fruits.add("Banana");
        fruits.add("Raagi");
        // Ascending sorting
        List<String > s1 = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Ascending sorting Using Both Method");
        System.out.println(s1);
        List<String > s2 = fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(s2);
        // Descending Order
        System.out.println("Descending sorting Using Both Method");
        List<String > s3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(s3);
        List<String > s4 =fruits.stream().sorted((w1,w2)->w2.compareTo(w1)).collect(Collectors.toList());
        System.out.println(s4);





//        // Ascending Order
//        List<String> sortingList1 =fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//        System.out.println(sortingList1);
//        List<String> sortingList =fruits.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
//        System.out.println(sortingList);
//        List<String> sortingList3 =fruits.stream().sorted().collect(Collectors.toList());
//        // Descending Order
//        System.out.println(" Descending Order");
//        List<String> sortingListD1 =fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(sortingListD1);
//        List<String> sortingListD =fruits.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
//        System.out.println(sortingListD);
//        List<String> sortingList3D =fruits.stream().sorted().collect(Collectors.toList());


    }
}
