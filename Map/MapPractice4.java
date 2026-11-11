import java.util.*;
class Employee{
    int eid;
    String Name;
    int Salary;

    public Employee(int eid,String Name,int Salary){
        this.eid=eid;
        this.Name=Name;
        this.Salary=Salary;
    }
    @Override 
    public String toString(){
        return("Employee Details eid : "+eid+"Name : "+Name+"Salary : "+Salary);

    }
    @Override 
    public void finalize(){
        System.out.println("Object is collected by garbage Collector");

    }
}
public class MapPractice4{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
         Employee e1 =new Employee(567,"Iran",9089074);
        WeakHashMap<Employee,Integer> hm= new WeakHashMap();  
        hm.put(e1,1);
        System.out.println(hm);

        e1=null;
        System.out.println(e1);
        System.gc();
        System.out.println(hm);

    }
}