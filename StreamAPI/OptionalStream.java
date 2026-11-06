import java.util.*;

class Student{

    String name;
    int age;
    int marks;


    public Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString(){
        return "Name: "+name+" Age: "+age+" Marks: "+marks;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getMarks(){
        return marks;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }
    


}
public class OptionalStream {

public static void main(String []args){

    ArrayList <String> names = new ArrayList<String>(Arrays.asList("John","Gems","Peter","Genny","samson","Genius"));
    String name = names.stream()
                .filter(nam -> nam.contains("a"))
                .findFirst()
                .orElse("Not Found");

                System.out.println(name);

                String name1 = names.stream()
                .map(na ->na .toUpperCase())
                .filter(nam -> nam.contains("A"))
                .findFirst()
                .orElse("Not Found");

                System.out.println(name1);
             ArrayList<Student> student = new ArrayList<Student>();


                Student s1 = new Student("John", 20, 80);
                Student s2 = new Student("Gems", 21, 90);
                Student s3 = new Student("Peter", 22, 70);
                Student s4 = new Student("Genny", 23, 60);
                Student s5 = new Student("samson", 24, 50);
                Student s6 = new Student("Genius", 25, 40);

                student.add(s1);
                student.add(s2);
                student.add(s3);
                student.add(s4);
                student.add(s5);
                student.add(s6);

                List<String> Leader = student.stream()
                        .filter(stu -> stu.getMarks() > 89)
                        .map(Student::getName)
                        .map(String::toUpperCase)
                        .toList();

                System.out.println(Leader);

                List<String> student2 = student.stream()
                        .map(Student::getName)
                        .map(String::toUpperCase)
                        .toList();
                        System.out.println(student2);


                





                List<Integer> student3 = student.stream()
                        .map(Student::getAge)
                        .map(age -> age * 2)
                        .toList();
                        System.out.println(student3);

}


}