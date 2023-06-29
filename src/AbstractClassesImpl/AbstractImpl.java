package AbstractClassesImpl;


abstract class Human {
    abstract void eat();

    void running() {
        System.out.println("Human IS Running");
    }
}


class Male extends Human {


    @Override
    void eat() {
        System.out.println("Male IS Running");

    }
}

public class AbstractImpl {
    public static void main(String[] args) {
        Human h = new Male();
        h.eat();


    }
}
