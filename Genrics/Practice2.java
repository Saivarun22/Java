import java.util.*;

class Human{
 
    public void sleep(){
        System.out.println("Human is sleeping");

    }

}
class Student extends Human{
    public void sleep(){
        System.out.println("Student is sleeping");
    }
}
class Employee{
    public void sleep(){
        System.out.println("Employee is sleeping");

    }
}

public class Practice2{
    public static void main(String[] args){
        Human h = new Human();
        h.sleep();

        Student s = new Student();
        s.sleep();

        h=s;

        ArrayList<Human> Hum = new ArrayList<Human>();
        ArrayList<Student> Stu = new ArrayList<Student>();
        
        //Hum=Stu; // This line will cause a compile-time error because ArrayList<Student> cannot be assigned to ArrayList<Human>
        
        ArrayList<?> Human = new ArrayList<Human>();
        ArrayList<Student> Student = new ArrayList<Student>();
        ArrayList<Employee> Employee = new ArrayList<Employee>();
        //Human=Student;
        //Student=Human; // This line is valid because ArrayList<?> can hold any type of ArrayList
        //Human=Employee;
        //Employee=Human;

        ArrayList<? extends Student> Human1 = new ArrayList<>();
        ArrayList<Human> h2 = new ArrayList<Human>();
        ArrayList<Student> std1 = new ArrayList<Student>();
        ArrayList<Object> obj = new ArrayList<Object>();

        //Human1=std1;//Valid
        //Human1=h2;//Error
        //Human1=obj;//Error

        ArrayList<? super Student> Human2 = new ArrayList<>();
        ArrayList<Human> h3 = new ArrayList<Human>();
        ArrayList<Student> std2 = new ArrayList<Student>();
        ArrayList<Object> obj1 = new ArrayList<Object>();

        //Human2=std2;//Valid
        //Human2=h3;//Valid
        //Human2=obj1;//Valid

        ArrayList<Human> Human3 = new ArrayList<>();
        Human3.add(new Human());
        Human3.add(new Human());

        ArrayList<Student> std3 = new ArrayList<Student>();

        std3.add(new Student());
        std3.add(new Student());
;
         invocksleep(Human3);
         invocksleep(std3);

    }

        public static void invocksleep(List<? extends Human> list){
            for(Human human : list){

                human.sleep();
            }
        }

    }
