package java8.Java8Streams;

import java.util.*;

public class NewStreamPractiseImpl {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
  Optional<Integer> ans =  al.stream()
                .filter(a->a %2 ==0)
                .sorted((a1,a2) ->a1.compareTo(a2))
                .findFirst();
        System.out.println(ans.get());


      int maxNumber =al.stream()
                .filter(a->a %2 ==0)
                .max(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2 -o1;
                    }
                }).get();

        System.out.println("maximum Number is  " + maxNumber);

        Set<Integer> set = new HashSet<>();
        set.add(1);


    }
}
