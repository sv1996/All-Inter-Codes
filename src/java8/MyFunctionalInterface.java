package java8;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String msg);
    default void mi()
    {
        System.out.println(" Default Method");
    }

    static void m2()
    {
        System.out.println(" static method ");
    }

}
