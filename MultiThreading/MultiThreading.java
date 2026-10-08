import java.util.*;
class UNO implements Runnable{

//         synchronized public void run(){

//         String player =Thread.currentThread().getName();
//         try{
//         System.out.println(player + " UNO is being played"  );
//         Thread.sleep(6000);


//         System.out.println(player + " Swipe Right +4 cards");
//         Thread.sleep(4000);

//         System.out.println(player + " Swipe left +2 cards");
//         Thread.sleep(2000);

//         System.out.println(player + " Colour change change  to red");
//         Thread.sleep(1000);

//         System.out.println(player + " Uno");
//         Thread.sleep(1000);
//         }
//         catch(InterruptedException e1){
//         e1.printStackTrace();
//     }
// }
     public void run(){

        String player =Thread.currentThread().getName();
        try{
        System.out.println(player + " UNO is being played"  );
        Thread.sleep(6000);

        synchronized (this){
        System.out.println(player + " Swipe Right +4 cards");
        Thread.sleep(4000);

        System.out.println(player + " Swipe left +2 cards");
        Thread.sleep(2000);

        System.out.println(player + " Colour change change  to red");
        Thread.sleep(1000);}

        System.out.println(player + " Uno");
        Thread.sleep(1000);
        }
        catch(InterruptedException e1){
        e1.printStackTrace();
    }
}
}
public class MultiThreading{

    public static void main(String args[]){

        UNO uno = new UNO();
        Thread tl = new Thread(uno);
        Thread t2 = new Thread(uno);
        Thread t3 = new Thread(uno);

        tl.setName("Player-1");
        t2.setName("Player-2");
        t3.setName("Player-3");

        tl.start();
        t2.start();
        t3.start();



    }
}
