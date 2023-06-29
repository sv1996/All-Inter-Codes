package java8;

class ThreadDemo implements Runnable
{

    @Override
    public void run() {

    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread  = new Thread(threadDemo);
        thread.start();
        Runnable runnable = ()-> System.out.println("Run Method called using lambda");

        Thread thread1 = new Thread(runnable);
        thread1.start();

    }
}
