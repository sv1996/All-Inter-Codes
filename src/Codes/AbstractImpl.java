package Codes;


abstract  class Rahul{
    abstract void hello();
    void helloOne(){}
    int a;
    static int b;
    Rahul(int a)
    {
      this.a =a;
    }
    Rahul()
    {

    }


}

class Shivam extends Rahul
{

    @Override
    void hello() {
        System.out.println("Hemlo World..! How are you");
    }
}
public class AbstractImpl {
    public static void main(String[] args) {
Shivam shivam = new Shivam();
shivam.hello();
    }
}
