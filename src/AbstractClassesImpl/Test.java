package AbstractClassesImpl;


class A {
    public A() {
        System.out.println("Parent constructor Called");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("Child Constructor Called");
    }
}
public class Test {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getClass());

    }
}
