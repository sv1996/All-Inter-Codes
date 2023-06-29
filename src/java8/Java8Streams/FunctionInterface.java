package java8.Java8Streams;

import java.util.List;
import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        List<Integer> al = List.of(1,2,3,4,5,6);
        Function<Integer,Integer> f = i -> i*i;
        al.stream().map(f).forEach(System.out::println);


    }
}
