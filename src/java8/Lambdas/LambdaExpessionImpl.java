package java8.Lambdas;

@FunctionalInterface
interface addable {
    int add(int a, int b);


}

@FunctionalInterface
interface messageDisplay {
    void sayHello(String str);


}

@FunctionalInterface
interface onlyMessage{
    void morningSay();
}

class TestForLambda implements addable,messageDisplay,onlyMessage {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void sayHello(String str) {
        System.out.println("Say Hello to This Method");
    }

    @Override
    public void morningSay() {
        System.out.println("Hemlo Good Morning");
    }


   void shivamMessage()
    {
        System.out.println("Hello This is Default");
    }

}


public class LambdaExpessionImpl {
    public static void main(String[] args) {
        addable added = (a, b) -> a + b;
        int ans = added.add(10, 20);
        System.out.println("Ans is " + ans);
        messageDisplay msg = (str)-> System.out.println("Say Hello to This Method " + str);
        msg.sayHello("Shivam");
        onlyMessage hem = ()-> System.out.println("Hemlo Good Morning");
        hem.morningSay();
        TestForLambda tl = new TestForLambda();
        tl.shivamMessage();


    }
}
