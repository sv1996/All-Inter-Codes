package Codes;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringFrequencyImpl {
    public static void main(String[] args) {
    /*    aa,bb,cc,dd,aa,bb,cc
        aa:2
        bb:2
        cc:2
        dd:1
*/
        List<String> al = Arrays.asList("aa", "bb", "cc", "dd", "aa", "bb", "cc");
        HashMap<String, Integer> ans = findFrequency(al);
        for (Map.Entry<String, Integer> entry : ans.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
    private static HashMap<String, Integer> findFrequency(List<String> al) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < al.size(); i++) {
            if (map.containsKey(al.get(i)))
            {
                map.put(al.get(i), map.get(al.get(i)) + 1);
            } else {
                map.put(al.get(i), 1);
            }
        }
        return map;
    }
}
