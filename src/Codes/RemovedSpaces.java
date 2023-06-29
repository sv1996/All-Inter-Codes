package Codes;

public class RemovedSpaces {
    public static void main(String[] args) {


        String str = "Shivam Vishwakarma is here for you..!!";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }



}
