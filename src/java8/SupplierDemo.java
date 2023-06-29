package java8;


import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime>
{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

public class SupplierDemo {

    public static void main(String[] args) {
//        Supplier<LocalDateTime> supplier = new SupplierImpl();
//       LocalDateTime time = supplier.get();
//        System.out.println("Time is {}"+ time);
        //
      Supplier <LocalDateTime> supplier =  ()-> LocalDateTime.now();
        System.out.println(supplier.get());



    }
}
