package java8;


interface Addable
{
    int addition(int a , int b);
}

class AddableImpl implements  Addable{

    @Override
    public int addition(int a, int b) {
        return (a+b);
    }
}

public class LambdaParameters {
    public static void main(String[] args) {
     Addable addable =  (a , b) ->  (a+b);
     int result =   addable.addition(12,10);
        System.out.println(result);


    }
}
