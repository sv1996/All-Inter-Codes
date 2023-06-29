package Interface;


interface interface1 {
    public default void display() {
        System.out.println("display method of MyInterface1");
    }


}

interface interface2 {
    public default void display() {
        System.out.println("display method of MyInterface2");
    }
}

public class MultipleInheritence implements interface1, interface2 {
    public void display() {
        System.out.println("display method of Classs");
    }


    public static void main(String[] args) {
        MultipleInheritence multipleInheritence = new MultipleInheritence();
        multipleInheritence.display();
    }


}
