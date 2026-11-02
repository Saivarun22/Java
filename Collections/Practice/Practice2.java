
import java.util.*;

public class Practice2 {
    public static void main(String args[]) {

        // 1. ARRAYLIST
        System.out.println("\n===== ARRAYLIST =====");

        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        // Index-based traversal
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
       

        // Forward traversal
        Iterator<Integer> itr1 = a.iterator();

        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        // Backward traversal
        ListIterator<Integer> itr2 = a.listIterator(a.size());

        while (itr2.hasPrevious()) {
            System.out.println(itr2.previous());
        }


        // 2. LINKEDLIST
        System.out.println("\n===== LINKEDLIST =====");

        LinkedList<Integer> l = new LinkedList<>();

        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);

        // Index-based traversal
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        // Forward traversal
        Iterator<Integer> itr3 = l.iterator();

        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }

        // Backward traversal
        ListIterator<Integer> itr4 = l.listIterator(l.size());

        while (itr4.hasPrevious()) {
            System.out.println(itr4.previous());
        }


        // 3. ARRAYDEQUE
        System.out.println("\n===== ARRAYDEQUE =====");

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        ad.add(50);

        // Forward traversal
        Iterator<Integer> itr5 = ad.iterator();

        while (itr5.hasNext()) {
            System.out.println(itr5.next());
        }

        // Backward traversal
        Iterator<Integer> itr6 = ad.descendingIterator();

        while (itr6.hasNext()) {
            System.out.println(itr6.next());
        }


        // 4. PRIORITYQUEUE
        System.out.println("\n===== PRIORITYQUEUE =====");

        PriorityQueue<Integer> p = new PriorityQueue<>();

        p.add(10);
        p.add(20);
        p.add(30);
        p.add(40);
        p.add(50);

        // Iterator traversal (order not guaranteed)
        Iterator<Integer> itr7 = p.iterator();

        while (itr7.hasNext()) {
            System.out.println(itr7.next());
        }

        // Priority-based retrieval
        PriorityQueue<Integer> p2 = new PriorityQueue<>(p);

        while (!p2.isEmpty()) {
            System.out.println(p2.poll());
        }


        // 5. HASHSET
        System.out.println("\n===== HASHSET =====");

        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        

        System.out.println(hs);

        // Forward traversal
        Iterator<Integer> itr8 = hs.iterator();

        while (itr8.hasNext()) {
            System.out.println(itr8.next());
        }


        // 6. LINKEDHASHSET
        System.out.println("\n===== LINKEDHASHSET =====");

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(40);
        lhs.add(50);
        
        System.out.println(lhs);

        // Forward traversal
        Iterator<Integer> itr9 = lhs.iterator();

        while (itr9.hasNext()) {
            System.out.println(itr9.next());
        }


        // 7. TREESET
        System.out.println("\n===== TREESET =====");

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(50);
        ts.add(30);
        ts.add(10);
        ts.add(40);
        ts.add(20);
        

        System.out.println(ts);

        // Forward traversal
        Iterator<Integer> itr10 = ts.iterator();

        while (itr10.hasNext()) {
            System.out.println(itr10.next());
        }

        // Backward traversal
        Iterator<Integer> itr11 = ts.descendingIterator();

        while (itr11.hasNext()) {
            System.out.println(itr11.next());
        }

        // TreeSet additional methods
        System.out.println("First: " + ts.first());
        System.out.println("Last: " + ts.last());
        System.out.println("Higher than 20: " + ts.higher(20));
        System.out.println("Lower than 20: " + ts.lower(20));

    }
}

