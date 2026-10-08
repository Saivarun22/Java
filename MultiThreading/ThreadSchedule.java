import java.util.*;
class Dinning implements Runnable{
    public void run(){
        if(Thread.currentThread().getName().equals("CHAIR")){
            chair();
        }else{
            table();
        }

    }
    public void chair(){
        for (int i=0;i<6;i++){
            System.out.println("Chair is available");
            for(int j=3;j<6;j++){
                System.out.println("Chair is occupied");

            }
        }
    }

    public void table(){
        for(int i=0;i<6;i++){
            System.out.println("Table is available");
            for(int j=3;j<6;j++){
                System.out.println("Table is occupied");
            }

        }
    }



}
public class ThreadSchedule{
    public static void main(String []args){
        Dinning d = new Dinning();
        Thread CHAIR = new Thread(d);
        Thread TABLE = new Thread(d);
        CHAIR.setName("CHAIR");
        TABLE.setName("TABLE");
        CHAIR.start();
        TABLE.start();
    }
}