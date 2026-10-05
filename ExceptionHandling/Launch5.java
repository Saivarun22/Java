
 import java.util.*;
 import java.lang.Thread;

 //Thread.sleep() may throw the checked InterruptedException. Therefore, Java requires us to either handle it using try-catch or declare it using throws. try-catch handles the exception in the current method, 
 // whereas throws passes the responsibility of handling the exception to the caller. When the exception is passed from one method to another, it is called exception propagation.

// class Alpha extends Thread{
//     public void alpha()throws InterruptedException{
//             System.out.println("Step 1 :Welcome To my App");
//             Thread.sleep(2000);
//             System.out.println("Step 2 :Login Credentials");
//             Thread.sleep(5000);
//             System.out.println("Step 3 :Dashboard");
//             Thread.sleep(15000);
//             System.out.println("Step 4 :Logout");
//   }
// }

    
// public class Launch5 {
//     public static void main(String args[]){
//         Alpha a =new Alpha();
//         try{
//             a.alpha();
//         }catch(InterruptedException e){
//             e.printStackTrace();
//         }
         
//         }
        

        
//     }

    


class Alpha extends Thread{
    public void alpha(){
        try{
            System.out.println("Step 1 :Welcome To my App");
            Thread.sleep(2000);
            System.out.println("Step 2 :Login Credentials");
            Thread.sleep(5000);
            System.out.println("Step 3 :Dashboard");
            Thread.sleep(15000);
            System.out.println("Step 4 :Logout");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
   }
}

    
public class Launch5 {
    public static void main(String args[]){
        Alpha a =new Alpha();
        a.alpha();
         
        }
        

}


