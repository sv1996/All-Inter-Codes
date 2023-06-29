package Codes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapImplementaion {
    public static void main(String[] args) {
        HashMap<String , Integer > map = new HashMap<>();
        map.put("Shivam",1);
        map.put("Karma",2);
        map.put("Neel",3);

        for(Map.Entry<String , Integer> m:map.entrySet())
        {
            System.out.println(m.getKey()  + " " + m.getValue());
        }
        System.out.println(List.of(map.keySet()));
    }
}
