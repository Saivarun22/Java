import java .util.*;
public class HashSet1{
    public static void main(String args[]){

        HashSet h = new HashSet();
        h.add("java");
        h.add(10);
        h.add("SpringBoot");
        h.add(30);
        h.add("microservices");
        h.add(50);
        h.add(80);
        h.add("Dsa");
        h.add("Programming");
        System.out.println(h);


        LinkedHashSet h1 = new LinkedHashSet();
        h1.add("java");
        h1.add(10);
        h1.add("SpringBoot");
        h1.add(30);
        h1.add("microservices");
        h1.add(50);
        h1.add(80);
        h1.add("Dsa");
        h1.add("Programming");
        System.out.println(h1);
    }
}