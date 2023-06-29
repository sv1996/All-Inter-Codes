package DesignPattern;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class SingletonDemo {


    private SingletonDemo() {

    }

}

public class Single {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        al.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
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
        }).forEach(System.out::println);

    }
}
