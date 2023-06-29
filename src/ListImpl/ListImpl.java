package ListImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ListImpl {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals(3)) {
                itr.remove();
            }

        }
        System.out.println("Printing the ArrayList{}" + al);
//        for (Integer a : al) {
//
//            if (a.equals(4)) {
//                al.remove(a);
//
//            }
//        }

    }


}

//    private static void  addNum(List<Integer> al) {
////        int sum =0;
////        for (Integer l:
////             al) {
////            sum+=l;
////        }
////
//        al.add(5);
//    }

