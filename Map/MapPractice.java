import java.util.HashMap;

import java .util.*;

class Student{

    int age;
    String name;

    public Student(int age,String name){
        this.age = age ;
        this.name = name;
    }
    @Override 
    public String toString(){
        return("age :"+age +"and name :" +name);

    }
}
public class MapPractice{
    public static void main (String args[]){
        HashMap hm = new HashMap();
        hm.put(1,"Varun");
        hm.put(2,"Ajay");
        hm.put(3,"Ganesh");
        hm.put(3,"Ram");//Dublicates can not be Created
        hm.put(null,null);/*Null Values are Accepted as both Value and key 
        only once because dubli cates are not allowed*/
        System.out.println(hm);


        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(1,"Varun");
        lhm.put(2,"Ajay");
        lhm.put(3,"Ganesh");
        lhm.put(3,"Ram");//Dublicates can not be Created
        lhm.put(null,null);/*Null Values are Accepted as both Value and key 
        only once because dubli cates are not allowed*/
        System.out.println(lhm);

        Student s = new Student(5,"ram");
        HashMap hm1 = new HashMap();
        hm1.put(s,"Sham");
        hm1.put("Ram","S");
        System.out.println(hm1);

        TreeMap tm = new TreeMap();
            tm.put(65,"Simple");
            tm.put(34,"Makes");
            tm.put(45,"Codes");
            tm.put(29,"Practice");
            //tm.put(90,null);null Values are not allowed 
            //tm.put(null,"Unstopble");null Keys are not allowed

        System.out.println(tm);

        Hashtable ht = new Hashtable();
        ht.put(65,"Simple");
        ht.put(34,"Makes");
        ht.put(45,"Codes");
        ht.put(29,"Practice");
        //ht.put(90,null);null Values are not allowed 
        //ht.put(null,"Unstopble");null Keys are not allowed 

        System.out.println(ht);

        
         

    }
}