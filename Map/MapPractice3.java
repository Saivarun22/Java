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
    public void finalze(){
        System.out.println("Object is collected by garbage Collector");

    }
}
public class MapPractice3{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details");
        int employeeid =sc.nextInt();
        Employee e1 =new Employee(567,"Iran",9089074);
        Employee e2 =new Employee(692,"Govrav",9658742);
        Employee e3 =new Employee(871,"Madhav",9059597);
        Employee e4 =new Employee(965,"Isha",90856597);
        Employee e5 =new Employee(989,"Isimile",9084548);

        HashMap<Integer,Employee> hm = new HashMap<>();
        hm.put(56,e2);
        hm.put(85,e5);
        hm.put(79,e1);
        hm.put(96,e4);
        hm.put(89,e3);

        System.out.println(hm);
        Set <Map.Entry<Integer,Employee>> entry = hm.entrySet();
        Iterator<Map.Entry<Integer,Employee>> itr1 = entry.iterator();
        Boolean found=false;
        while(itr1.hasNext()){
            
            Map.Entry<Integer,Employee> e =itr1.next();
            if(e.getValue().eid==employeeid){
            System.out.println("Key  : "+e.getKey()+" Value  :  "+e.getValue());
            found=true;
            break;
            }
        }
        if (!found) {
            System.out.println("Enter a valid Employee ID");
        }

        sc.close();
        


    }
}