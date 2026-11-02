import java.util.*;
import java.util.Comparator;
class Member{
    int id;
    String name;
    int age;

    public Member(int id,String name,int age){
        super();
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "Member [id=" + id + ", name=" + name + ",age=" + age + "]";
    }

    // public static class Alpha implements Comparator<Member>{
    //     public int compare(Member m1, Member m2){
    //         int age1 = m1.age;
    //         int age2 = m2.age;

    //         if(age1>age2){
    //             return 1;}
    //         else if (age1<age2) {
    //             return -1;
    //         }
    //         else{
    //             return 0;
    //         }
    //     }

   }


public class Student{
    public static void main (String args[]){

        ArrayList<Member>a =new ArrayList<Member>();
        a.add(new Member(1, "Alice", 20));
        a.add(new Member(2, "Bob", 22));
        a.add(new Member(3, "Charlie", 21));

        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));

        // Member.Alpha alpha = new Member.Alpha();
        // Collections.sort(a,new Comparator<Member>(){
        //     public int compare(Member m1, Member m2){
        //         int age1 = m1.age;
        //         int age2 = m2.age;

        //         if(age1>age2){
        //             return 1;}
        //         else if (age1<age2) {
        //             return -1;
        //         }
        //         else{
        //             return 0;
        //         }
        //     }
        // });
        
        Collections.sort(a,(m1,m2) ->(m1.age>m2.age)?1:(m1.age<m2.age)?-1:0);
        System.out.println(a.get(0));
        System.out.println(a.get(1));
        System.out.println(a.get(2));
    }
}

// import java.util.*;
// class Member implements Comparable<Member>{
//     int id;
//     String name;
//     int age;

//     public Member(int id,String name,int age){
//         super();
//         this.id=id;
//         this.name=name;
//         this.age=age;
//     }

//     public String toString(){
//         return "Member [id=" + id + ", name=" + name + ",age=" + age + "]";
//     }

    
//         public int compareTo(Member m2){
//             int age1 = this.age;
//             int age2 = m2.age;

//             if(age1>age2){
//                 return 1;}
//             else if (age1<age2) {
//                 return -1;
//             }
//             else{
//                 return 0;
//             }
//         }

//     }


// public class Student{
//     public static void main (String args[]){

//         ArrayList<Member>a =new ArrayList<Member>();
//         a.add(new Member(1, "Alice", 20));
//         a.add(new Member(2, "Bob", 22));
//         a.add(new Member(3, "Charlie", 21));

//         System.out.println(a.get(0));
//         System.out.println(a.get(1));
//         System.out.println(a.get(2));

        
//         Collections.sort(a);
        
//         System.out.println(a.get(0));
//         System.out.println(a.get(1));
//         System.out.println(a.get(2));
//     }
// }