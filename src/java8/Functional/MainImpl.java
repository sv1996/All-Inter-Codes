package java8.Functional;

public class MainImpl {
    public static void main(String[] args) {
//       // Find first non repeated character in a string.
     String str = "hello";
//       // out put = a
   char ch =findNonRepeatingCharacter(str);
      System.out.println("First Non repeating character {}-->" +ch);
    //    Check whether a given string is palindrome or not using Time Complexity / HashMap
//String str = "dabcba";
//boolean ans =checkPalindrome(str);
//if(ans)
//{
//    System.out.println("Palindrome");
//
//}
//else
//{
//    System.out.println("Not Palindrome");
//
//}

    }

    private static boolean checkPalindrome(String str) {
        int i =0;
        int j = str.length()-1;
        boolean isPalindrome = false;
        while (i<j)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                isPalindrome = true;

            }
            i++;
            j--;
        }
     return isPalindrome;
    }

    //

    private static char findNonRepeatingCharacter(String str) {
       char ch [] = str.toCharArray();

       int count [] = new int [256];
       char ans = ' ';

        for (int i = 0; i <ch.length ; i++) {
            count[ch[i]]++;
        }

        for (int i = 0; i <ch.length; i++) {
            if(count[ch[i]] ==2)
            {
                ans = ch[i];
                break;
            }
        }
return ans;
        }
//
//            char ans = ' ';
//
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//        for (int i = 0; i < ch.length; i++) {
//            if(map.containsKey(ch[i]))
//            {
//                map.put(ch[i], map.get(ch[i])+1);
//            }
//            else
//            {
//                map.put(ch[i] ,1);
//            }
//        }
//        for (Map.Entry<Character, Integer> m : map.entrySet())
//        {
//            if(m.getValue() ==1)
//            {
//                ans = m.getKey();
//                break;
//            }
//        }
//
//    return ans;
//
//    }

//    private static char findNonRepeatingCharacter(String str) {
//        char ch [] = str.toCharArray();
//
//            char ans = ' ';
//
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//        for (int i = 0; i < ch.length; i++) {
//            if(map.containsKey(ch[i]))
//            {
//                map.put(ch[i], map.get(ch[i])+1);
//            }
//            else
//            {
//                map.put(ch[i] ,1);
//            }
//        }
//        for (Map.Entry<Character, Integer> m : map.entrySet())
//        {
//            if(m.getValue() ==1)
//            {
//                ans = m.getKey();
//                break;
//            }
//        }
//
//    return ans;
//
//    }
}
