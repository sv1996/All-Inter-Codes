package java8;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        String s1 = "Shivam";
        String s2 ="Vishwakarma";
        int arr[] = {5,4,3,2,6,1,6,10,8,7};

        //

        try
        {
            System.out.println("Throws");
           throw new StackOverflowError();

        }
catch (Throwable t)
{

    System.out.println("Hello Throwable");

}


        System.out.println("End");






    }
}
