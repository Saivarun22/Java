
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;

@Target({
    ElementType.TYPE,
    ElementType.FIELD,
    ElementType.CONSTRUCTOR,
    ElementType.LOCAL_VARIABLE
})
@Retention(RetentionPolicy.RUNTIME)
@interface Employee {

    String Region() default "South";

    String Department() default "Tech";
}

@Employee
class Details {

    @Employee
    int Salary;

    int Employeeid;

    @Employee
    public Details() {
        System.out.println("Initialized Constructor");
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public int getSalary() {
        return Salary;
    }

    public void setEmployeeid(int Employeeid) {
        this.Employeeid = Employeeid;
    }

    public int getEmployeeid() {
        return Employeeid;
    }
}

public class AnnotationPractice2 {
    public static void main(String args[]) {

        Details d = new Details();

        d.setSalary(75000);

        System.out.println(d.getSalary());

        Class c = d.getClass();
        Annotation a = c.getAnnotation(Employee.class);
        Employee e =(Employee) a;
        System.out.println(e.Region());
        System.out.println(e.Department());
    }
}
