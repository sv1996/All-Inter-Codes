package java8.Functional;

public class Main {
    public static void main(String[] args) {
        myFunction m = (int x, int y) -> (x+y);
        int result = m.sum(0,30);
        System.out.println(result);
        }
     }

