package java8.Java8Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyUsingStreams {
    public static void main(String[] args) {
        List<Character> list = Arrays.asList('a', 'a', 'b', 'b', 'c', 'd');
        Map<Character, Long> frequency = list.stream().collect
                (Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        for (Map.Entry<Character, Long> m : frequency.entrySet()) {
            System.out.println(m.getKey() + "->" + m.getValue());
        }
        System.out.println("Get My answers");
        frequency.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Hello I am Here");
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("Z", 6);
        map.put("E", -1);
        map.put("J", 0);
        map.put("M", 12);
        List<Map.Entry<String ,Integer>> al = new ArrayList<>(map.entrySet());
        Collections.sort(al,Map.Entry.comparingByKey());
        System.out.println(al);
        Collections.sort(al,Map.Entry.comparingByValue());
        System.out.println(al);







    }
}
