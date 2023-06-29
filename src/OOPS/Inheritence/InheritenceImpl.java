package OOPS.Inheritence;
class P{
    public void m1()
    {
        System.out.println("Parent Class Method");
    }
}

class C extends  P{


    public void m2()
    {
        System.out.println("Child class Method");
    }

    public void m1()
    {
        System.out.println("Parent-Child Class Overriding Method");
    }


}

public class InheritenceImpl {
    public static void main(String[] args) {
//        P p = new P();
//        p.m1();
        P p = new C();
        p.m1();
        // p.m1() will Print child class overriding method
      C c = new C();
        c.m1();
        c.m2();
  // C c1= new P(); This is Not Possible

    }
}
