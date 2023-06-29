package java8.Java8Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateSteamObjects {
    public static void main(String[] args) {
        // create A stream
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);

        // create a stream from source
        Collection<String> collection=Arrays.asList("Java","Spring","Boot");
        Stream <String> stream1 =collection.stream();
        stream1.forEach(System.out::println);

        Set<String> set = new HashSet<>(Arrays.asList("Hello" , "All" , "Something"));
        Stream<String> streams =set.stream();
        streams.forEach(System.out::println);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"shivam");
        map.put(2,"Vishwakarma");
        map.put(3,"Karma");
        map.put(4,"Lavish");


    }
}
