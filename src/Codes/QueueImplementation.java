package Codes;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>();
        q.add("shivam");
        q.add("garima");
        q.add("vihswakarma");
        System.out.println(q);
        System.out.println("This is Next Level Class");

        Iterator itr = q.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
