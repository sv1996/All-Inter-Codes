package Codes;

import java.util.Arrays;
import java.util.List;

public class MainImplements {
    public static void main(String[] args) {
// //list of words
//        List<String> words = Arrays.asList("apple","orange","cat","hELLO");
//        //String input
//        String input = "HEllo hello how 123cat123 are you";
//
//
//      Expand (5 lines)
//      Collapse
        List<String> words = Arrays.asList("apple","orange","cat","hELLO");
        String input = "HEllo hello how 123cat123 are you";

//        Predicate<String> p = new Predicate<String>() {
//            @Override
//            public boolean test(String str) {
//            String  str1 [] =    input.split("");
//                for (int i = 0; i <str1.length ; i++) {
//
//                }
//            }
//        }
//

        long ans = words.stream().filter(w->input.toUpperCase().contains(w.toUpperCase())).count();
        System.out.println(ans);
    }
}
