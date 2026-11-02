import java.util.*;
public class Practice {
    public static  void main(String args[]){
        
        PriorityQueue pq = new PriorityQueue();
        pq.add(120);
        pq.add(30);
        pq.add(90);
        pq.add(150);
        pq.add(45);
        pq.add(80);
        pq.add(100);
        pq.add(23);
        System.out.println(pq);

        System.out.println(pq.isEmpty());
        System.out.println(pq.contains(125));
        System.out.println(pq.removeIf((n -> (int) n == 244)));
        

    }

}
