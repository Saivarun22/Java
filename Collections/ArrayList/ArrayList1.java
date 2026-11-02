import java.util.*;
 public class ArrayList1{
    public static void main(String[] args) {
        
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l);

        ArrayList l2 = new ArrayList();
        l2.add("Java");
        l2.add('s');
        l2.add("Concepts are not ");
        l2.add("100");
        l2.add('%');
        l2.add("object oriented");

        System.out.println(l2);

        ArrayList l3 =new ArrayList();
        l3.addAll(l2);
        l3.add("implemeted addAllmethod");
        System.out.println(l3);


        ArrayList l4 = new ArrayList();
        l4.addAll(l3);
        l4.add(2,"Springboot");
        l4.add(4,"Microservices");
        System.out.println(l4);
        System.out.println(l4.get(3));

        
    }
 }