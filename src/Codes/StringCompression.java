package Codes;

public class StringCompression {
    public static void main(String[] args) {

        /*
        Input: VVVVVTTTTKKKVV
        Output: 5V4T3K2V
  */
        String str = "VVVVVTTTTKKKVV";
        String ans  = getCompressedString(str);
        System.out.println("Compressed String " + ans);


    }

    private static String getCompressedString(String str) {
        int count =1;
        String ans  ="";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <str.length()-1; i++)
        {
            if(str.charAt(i) ==str.charAt(i-1))
            {
                count++;
            }
         else
            {
               sb.append(count);
               sb.append(str.charAt(i-1));
               count =1;
            }
         // last one

        }



       String newStr  = sb.toString();
        return newStr;

    }
}
