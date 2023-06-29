package Codes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Impl {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Shivam");
        map.put(2,"Vishwakarma");
        map.put(3,"Neelam");
        List<String> ans =    map.values().stream().collect(Collectors.toList());
        System.out.println(ans);
        List<Integer> data =al.stream().filter(p->p % 2 ==0).collect(Collectors.toList());
        data.forEach(d-> System.out.println(d));

    }
}
