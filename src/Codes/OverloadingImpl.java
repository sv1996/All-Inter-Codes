package Codes;

class A{
    void m1()
    {
        System.out.println("In m1 A");
    }
}
class B extends A{
    void m1()
    {
        System.out.println("In m1 B");
    }

    void m2()
    {
        System.out.println("In m2 B");
    }
}

public class OverloadingImpl {
    void m2(Integer a){
        System.out.println("Integer");
    }

    void m2(int a){
        System.out.println("int");
    }

    void m1(String a){
        System.out.println("string");
    }

    void m1(Object a){
        System.out.println("object");
    }

    public static void main(String[] args) {
      //  OverloadingImpl overloading = new OverloadingImpl();
     //   overloading.m1("hello");
    //    overloading.m2(10);
//        B b=new B();
//        b.m1();

        A a=new B();
        a.m1();
//
//        A a=new B();
//        a.m2();

    }
    }

