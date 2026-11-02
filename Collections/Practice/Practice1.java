
import java.util.*;

public class Practice1 {
    public static void main(String args[]) {

        // 1. ArrayList
        // Allows duplicate elements and multiple null values.
        ArrayList l = new ArrayList();
        l.add("java");
        l.add(null);
        l.add(null);
        System.out.println(l); 


        // 2. LinkedList
        // Allows duplicate elements and multiple null values.
        LinkedList li = new LinkedList();
        li.add("java");
        li.add(null);
        li.add(null);
        System.out.println(li); 


        // 3. ArrayDeque
        // Does NOT allow null elements.
        // Adding null throws NullPointerException.
        // Therefore, the program stops at the first null insertion.
        ArrayDeque a = new ArrayDeque();
        a.add("java");
        // a.add(null); // Throws NullPointerException
        // a.add(null);
        System.out.println(a); 


        // 4. PriorityQueue
        // Does NOT allow null elements.
        // Adding null throws NullPointerException.
        PriorityQueue p = new PriorityQueue();
        p.add("java");
        // p.add(null); // Throws NullPointerException
        // p.add(null);
        System.out.println(p); 

        // 5. TreeSet
        // Does not allow null when using natural ordering.
        // Adding null throws NullPointerException.
        // Also, TreeSet does not allow duplicate elements.
        TreeSet s = new TreeSet();
        s.add("java");
        // s.add(null); // Throws NullPointerException
        // s.add(null);
        System.out.println(s); 


        // 6. HashSet
        // Allows one null element.
        // Duplicate elements are not allowed.
        HashSet h = new HashSet();
        h.add("java");
        h.add(null);
        h.add(null);
        System.out.println(h); 


        // 7. LinkedHashSet
        // Allows one null element.
        // Does not allow duplicate elements.
        // Maintains insertion order.
        LinkedHashSet lh = new LinkedHashSet();
        lh.add("java");
        lh.add(null);
        lh.add(null);
        System.out.println(lh); 

    }
}
