import java .util.*;
public class MapPractice2{
    public static void main (String args[]){
        HashMap <Integer,String> hm = new HashMap <>();
        hm.put(1,"Varun");
        hm.put(2,"Ram");
        hm.put(3,"Kirshna");
        System.out.println(hm);

        Collection values = hm.values();
        Iterator itr1 = values.iterator();;
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        Collection Keys = hm.keySet();
        Iterator itr2 = Keys.iterator();;
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        Set<Map.Entry<Integer,String>> entry  = hm.entrySet();
        Iterator <Map.Entry<Integer,String>> itr3 = entry.iterator();;
        while(itr3.hasNext()){
            Map.Entry<Integer,String> e =itr3.next();
            System.out.println("Key  : "+e.getKey()+" Value  :  "+e.getValue());
        }
    }

}