import java.util.*;
class Library implements Runnable{
    String Res1 = new String("Java");
    String Res2 = new String("SpringBoot");
    String Res3 = new String("DSA");

    public void run(){

        String ThreadName=Thread.currentThread().getName();

        if(ThreadName.equals("Student1")){
            try{
            Thread.sleep(5000);

            

                synchronized(Res1){

                    System.out.println("Student 1 Has Accured "+ Res1);
                    Thread.sleep(4000);
                
                synchronized(Res2){

                    System.out.println("Student 1 Has Accured "+ Res2);
                    Thread.sleep(4000);
                
                synchronized(Res3){

                    System.out.println("Student 1 Has Accured "+ Res3);
                    Thread.sleep(4000);

                }
            }
        }
                
            }
            catch(Exception e){
                System.out.println("some thing went wrong");
            }
        }
        else{
            try{

            Thread.sleep(5000);

            

                synchronized(Res3){

                    System.out.println("Student 2 Has Accured "+ Res3);
                    Thread.sleep(4000);
                
                synchronized(Res2){

                    System.out.println("Student 2 Has Accured "+ Res2);
                    Thread.sleep(4000);
                
                synchronized(Res1){

                    System.out.println("Student 2 Has Accured "+ Res1);
                    Thread.sleep(4000);
                
                }
            
                
            }
        }
            }
            catch(Exception e){
                System.out.println("some thing went wrong");
            }
        }
    }

}
public class DeadLock{
    public static void main(String args[]){

        Library lib = new Library();
        Thread T1 = new Thread(lib);
        Thread T2 = new Thread(lib);

        T1.setName("Student1");
        T2.setName("Student2");

        T1.start();
        T2.start();


    }
}