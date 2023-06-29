package HashMapImpl;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxFrequencyElementImpl {
    public static void main(String[] args) {
        String str = "aaaabbbbc";
        char ch = getMaxFrequencyElement(str);
        getMaxFrequencyElementUsingStream(str);
        System.out.println("Get Max Frequency Element");
        System.out.println(ch);
    }

    private static void getMaxFrequencyElementUsingStream(String str) {
        char[] ch = str.toCharArray();
        List<Character> al = new ArrayList<>();

        for (int i = 0; i < ch.length; i++) {
            al.add(ch[i]);
        }
        Map<Character, Long> map = al.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }

    private static char getMaxFrequencyElement(String str) {
        char ch[] = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                map.put(ch[i], 1);
            }
        }

        int max = Integer.MIN_VALUE;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                maxChar = m.getKey();
            }
        }
        return maxChar;
    }
}
