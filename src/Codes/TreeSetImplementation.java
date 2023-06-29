package Codes;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;

        return -s1.compareTo(s2);
    }
}
public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add("z");
        t.add("a");
        t.add("b");
        t.add("e");
        Iterator itr = t.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
