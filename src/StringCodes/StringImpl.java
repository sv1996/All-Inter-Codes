package StringCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringImpl {
    public static void main(String[] args) {
        String str = "abbcccd";
        countFrequencyOfEachCharacter(str);
    }

    private static void countFrequencyOfEachCharacter(String str) {
        char [] charArray = str.toCharArray();
        List<Character> charList = new ArrayList<>(charArray.length);
        for (int i = 0; i < charArray.length; i++) {
            charList.add(charArray[i]);
        }

        for(int i=0;i<charArray.length;i++)
        {
            int count = Collections.frequency(charList,charArray[i]);
        }
        for(Character ch : charList)
        {
            int countCharInCollection = Collections.frequency(charList,ch);
            System.out.println("character "+ch +"-->"+countCharInCollection);
        }
    }
}
