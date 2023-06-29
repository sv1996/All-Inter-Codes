package java8.Java8Streams;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        // getting maximum Values from a List
        System.out.println("getting maximum Values from a List");
      int max =   list.stream().max(new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
              return o1.compareTo(o2);
          }
      }).get();
        System.out.println("Maximum Numbers in the List"+max);
        /*
    Given a list of integers, find out all the even numbers exist in the list using Stream functions?
     */
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::print);
        System.out.println("Method-1");
         /*
        Q2 Given a list of integers, find out all the numbers starting with 1 using Stream functions?
         */
        list.stream().map(s -> String.valueOf(s)).filter(s -> s.startsWith("1")).forEach(System.out::println);
        /*
        Q4 Given the list of integers, find the first element of the list using Stream functions?
        */
        list.stream().findFirst().ifPresent(System.out::print);
        /*
        Given a list of integers, find the total number of elements present in the list using Stream functions?
       */
        long count = list.stream().count();
        System.out.println(count);
        /*
        Q6 Given a list of integers, find the maximum value element present in it using Stream functions?
         */
        int ans = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).get();
        System.out.println("Max is" + ans);
        /*
        Q9 Given a list of integers, sort all the values present in it using Stream functions?
       */
        System.out.println("Main List");
        list.stream().forEach(System.out::println);
        System.out.println("Sort List");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("Sort List in Reverse Order");
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        // find duplicates elements in List of Integers
        List<Integer> listOne = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 7, 7);
        Set<Integer> set = new HashSet<>();
        List<Integer> duplicates = listOne.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
        System.out.println("Find Duplicates in the List {}");
        duplicates.forEach(a -> System.out.println(a));
        System.out.println("Printing Prime Numbers");
        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> p = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                // devide by 1 or Itself
                if (num == 0 || num == 1) {
                    return false;
                }
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }

                return true;
            }
        };
        List<Integer> a = al.stream().filter(p).collect(Collectors.toList());
        a.forEach(System.out::print);
    }

    private static boolean isPrime(Integer num) {
        // devide by 1 or Itself
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }
}
