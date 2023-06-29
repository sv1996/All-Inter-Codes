package OOPS.Inheritence.OverLoading;

public class MainTest {
    public void m1(String s) {
        System.out.println("Hello This is String Method Call " + s);
    }

    public void m1(Object ob) {
        System.out.println("Hello This is Object Method Call " + ob);
    }


    public static void main(String[] args) {
        MainTest mainTest = new MainTest();
        mainTest.m1(new String("Shivam Vishwakarma"));   //  String method will call
        mainTest.m1(null);    // String method will call
        Integer i = 10;
        mainTest.m1(i);    // Object Mehod will call
    }
}
