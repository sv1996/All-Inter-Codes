package Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Abs
{

  //  printA();
    //  printB();

   void printA()
    {
        System.out.println("Hello A");
    }

void printB()
{
    System.out.println("Hello B");

}




}



class Ab1 extends  Abs
{
  void  printC()
    {
        System.out.println("hello C");
    }

    void printB()
    {
        System.out.println("Hello Child B");

    }

}

public class MainImpl {

    public static void main(String[] args) {
        Abs obj = new Ab1();
        obj.printB();
        //int arr[] = {1,4,2,3,7,9,10,13,12};
Integer arr[] = {1,4,2,3,7,9,10,13,12};
List<Integer> al = Arrays.asList(arr);
al.stream().filter(a->a%2==0).collect(Collectors.toList()).forEach(System.out::println);



    }
}
