package StringCodes;

public class StringBufferImpl {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("ashok");
        StringBuffer s2 = new StringBuffer("ashok");
        System.out.println(s1==s2);  //false
        System.out.println(s1.equals(s2) );  //false

    }
}
