import java.util.*;
public class Practice3{
    public static void main (String args[]){
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);

        // for(int i=0;i<a.size();i++){
        //     a.add(40);
        //     System.out.println(a);
        //     }

        Iterator i1 = a.iterator();

        while (i1.hasNext()) {
             a.add(50); // Directly modifying ArrayList while iterating causes ConcurrentModificationException
             System.out.println(i1.next()); // Iterator detects the structural modification and throws an exception
            }
        
        
            Iterator i = a.iterator();

             while (i.hasNext()) {
                System.out.println(i.next()); // Retrieves the next element successfully
                a.add(50); // Modifying ArrayList directly during iteration causes ConcurrentModificationException in the next iteration
            }
    }
}