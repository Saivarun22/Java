import java.util.*;
@FunctionalInterface
interface APP{

    void feature();
    
    //void feature2();
}
class Aeroplane{

    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class Flight extends Aeroplane{
    @Override 
    public void fly(){
        System.out.println("Flight is flying");
    }
}
public class AnnotationPractice1{
    public static void main (String args[]){

        APP app = () -> System.out.println("New Feature Updated");
        app.feature();
        //app.feature2();

        Aeroplane ap = new Flight();
        ap.fly();

    }
}