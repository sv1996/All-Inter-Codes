package java8.Java8Streams;

import java.util.Iterator;
import java.util.List;


public class IterableImpl {




    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6);

      Iterator iterator =list.iterator();
      while (iterator.hasNext())
      {
          iterator.remove();
          System.out.println(iterator.next());
      }

    }
}
