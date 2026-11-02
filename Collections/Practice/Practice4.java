import java.util.*;
public class Practice4{
    public static void main(String args[]){

        ArrayList a = new ArrayList();
        a.add(24);
        a.add(89);
        a.add(75);
        a.add(36);
        a.add(59);

        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.shuffle(a);
        System.out.println(a);
        System.out.println(Collections.frequency(a,75));
        Collections.rotate(a,3);
        System.out.println(a);

    

    ArrayList b = new ArrayList(Arrays.asList(58,69,56,48,34));
    System.out.println(b);
    //     for(Object x: b){
    //     System.out.println(x);
    // }

    b.forEach(x -> System.out.println(x));
    

    String[] names = new String[7];
    names[0] ="Varun";
    names[1] ="Rohit";
    names[2] ="Ramesh";
    names[3] ="Rakesh";
    //names[4] =90;

    System.out.println(names[0].toUpperCase());
    //System.out.println(names[4].toLowerCase());

    ArrayList c = new ArrayList<>();
    c.add("Varun");
    c.add("Rohit");
    c.add("Ramesh");
    c.add("Rakesh");
    c.add(80);

    System.out.println(c.get(0).toString().toUpperCase());
    System.out.println(c.get(4).toString().toUpperCase());



}
}