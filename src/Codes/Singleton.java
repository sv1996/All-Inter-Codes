package Codes;
public class Singleton {
    static Singleton singleton = new Singleton();
    private Singleton()
    {

    }
    public static Singleton getSingleton()
    {
        return singleton;
    }
    public String msg()
    {
        return "Object cReated";
    }
//https://leetcode.com/problems/climbing-stairs/
//
//https://leetcode.com/problems/3sum/description/

    //
    public static void main(String[] args) {
         Singleton object =    Singleton.getSingleton();
        String ans  =object.msg();
        System.out.println(ans);

    }
}
