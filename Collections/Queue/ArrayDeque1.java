import java.util.*;
public class ArrayDeque1{
    public static void main(String args[]){
        ArrayDeque a = new ArrayDeque();
        a.add("java");
        a.add("SpringBoot");
        a.add(100);
        a.add("io");
        a.add("Microservices");
        a.add(20);
        a.add(30);
        a.add(80);
        a.addFirst(50);
        a.addLast(90);
        System.out.println(a);
        System.out.println(a.contains("Springboot"));
        System.out.println(a.offerFirst("Offer"));
        a.removeIf(n -> n instanceof String);
        System.out.println(a);
        
        
    }
}