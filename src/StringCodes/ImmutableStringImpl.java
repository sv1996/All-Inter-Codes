package StringCodes;

public class ImmutableStringImpl {

    public static void main(String[] args) {
        // One Object will be created in SCP
        String str1 = "shivam";
        // Two Object will be Created and
        // str2 will always point to Heap Area
        String str2 = new String("shivam");
        System.out.println(str1 == str2); // false;
        System.out.println(str1.equals(str2)); // true
        str1 = str1.concat("vishwakarma"); // will create new Object
        System.out.println(str1);// "shivamVishwakarma
        str1 = "new";
        System.out.println(str1);// o/p - new //refer to new
        System.out.println(str1 == str2); // false
        System.out.println("New Algorithms Below Down");
        String s1 = new String("youcantchangeme");
        String s2 = new String("youcantchangeme");
        System.out.println(s1 == s2); // false
        String s3 = "youcantchangeme";
        String s4 = "youcantchangeme";
        System.out.println(s1 == s4); // false
        System.out.println(s1.equals(s4)); // true




    }
}
