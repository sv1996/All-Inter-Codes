package AbstractClassesImpl;


class StaticImpl {
    int a = 10;

    public static void hello() {
        System.out.println("Hello Deer");
    }
}

public class HelloWorld {
    public static void main(String[] args) {
//        InterfaceImpl i = new InterfaceImpl();
//        i.eating();
//
//        System.out.println(myInterface.a);
        StaticImpl s = new StaticImpl();
        s.hello();
    }

}
