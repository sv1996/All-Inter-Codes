package java8.OptionalPackage;

import com.sun.security.jgss.GSSUtil;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String email ="jhdjhd";
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional.get());

        Optional.ofNullable(email);
        Optional<String> stringOptional = Optional.ofNullable(email);
//        if(stringOptional.isPresent())
//        {
//            System.out.println(stringOptional.get());
//        }
//        else
//
//        {
//            System.out.println("No value present");
//        }

       String defaultOptional =  stringOptional.orElse("defaultValue");
        System.out.print(defaultOptional);
        System.out.println("All is One");
        String str =  "Rohan";
        Optional<String> MyOptional = Optional.ofNullable(str);

         if(MyOptional.isEmpty())
        {
            System.out.println("Hello I am Not Empty At All");
        } else
        {
            System.out.println("I am Empty");
        }
    }
}
