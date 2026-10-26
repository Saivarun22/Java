import java.util.*;
class IDE implements Runnable{

    public void run(){

        String ThreadName = Thread.currentThread().getName();

        if(ThreadName.equals("Type")){

            type();

        }
        else if (ThreadName.equals("CrossCheking")){

            crossCheck();

        }
        else{

            autosave();
            
        }

    }
    public void type(){
        for(int i=0;i<=4;i++){
            System.out.println("you are typing in console");
            try{
            Thread.sleep(4000);
            } 
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void crossCheck(){
        for(;;){
            System.out.println("you are CrossChecking in console");
            try{
            Thread.sleep(4000);
            } 
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void autosave(){
        for(;;){
            System.out.println("you are autosaving in console");
            try{
            Thread.sleep(4000);
            } 
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class MultiThreading1{
    public static void main(String[] args) {
        
        IDE i = new IDE();

        Thread T1 = new Thread(i);
        Thread T2 = new Thread(i);
        Thread T3 = new Thread(i);

        T1.setName("Type");
        T2.setName("CrossCheking");
        T3.setName("AutoSave");

        T1.setPriority(9);
        T2.setPriority(7);
        T3.setPriority(5);

        T2.setDaemon(true);
        T3.setDaemon(true);

        T1.start();
        T2.start();
        T3.start();



    }
}