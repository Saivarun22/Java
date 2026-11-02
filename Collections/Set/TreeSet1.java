import java.util.*;
public class TreeSet1{
    public static void main (String args []){
        TreeSet t = new TreeSet();
        t.add(125);
        t.add(100);
        t.add(50);
        t.add(75);
        t.add(25);
        t.add(150);
        t.add(175);
        t.add(250);
        t.add(225);
        t.add(200);

        System.out.println(t);
        System.out.println(t.ceiling(145));
        System.out.println(t.floor(145));
        System.out.println(t.higher(145));
        System.out.println(t.lower(145));
        System.out.println(t.headSet(150));
        System.out.println(t.tailSet(145));
        System.out.println(t.contains(145));
        t.add(150);
        System.out.println(t);
    }
}