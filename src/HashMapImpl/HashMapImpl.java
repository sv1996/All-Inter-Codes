package HashMapImpl;

import java.util.*;
import java.util.concurrent.Callable;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Zandya",123);
        map.put("Shivam",-1);
        map.put("Garima",56);
        map.put("Shruti",88);
        map.put("Ayushi",18);
        // sort the map Using Keys

        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,Map.Entry.comparingByKey());
        for(Map.Entry<String,Integer> entry: list)
        {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }

        //
        System.out.println("Sort By values");
        Collections.sort(list,Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : list)
        {
            System.out.println(entry.getKey() +" "+ entry.getValue());
        }


    }
}
