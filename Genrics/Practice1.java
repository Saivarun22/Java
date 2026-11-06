import java.util.*;

interface REF <T>{
     T getType();

}
class REFR <T> implements REF <T>{

    T Type;

    public REFR(){

    }
     
    public REFR(T Type){
        this.Type = Type;


    }
    public T getType(){
        return Type;
    }
    public void setType(T Type){
        this.Type = Type;
    }

    public String toString(){
        return "Type: " +Type;
    }
}
    
    public class Practice1{
        public static void main (String [] args){

            REFR <Object> obj = new REFR <>();
            obj.setType("Hello");
            System.out.println(obj.getType());
            System.out.println(obj.getType().getClass().getName());

            REFR <String> str = new REFR <>();
            str.setType("Java Is Awesome ");
            System.out.println(str.getType());
            System.out.println(str.getType().getClass().getName());

            REFR <Integer> intRef = new REFR <>();
            intRef.setType(896);
            System.out.println(intRef.getType());
            System.out.println(intRef.getType().getClass().getName());


            

            
        }
    }
