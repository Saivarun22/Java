import java.util.Scanner;

class Details implements Runnable{

    public  void run(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your PAN number");
        String pan=sc.nextLine();
        System.out.println("Enter your Aadhar number");
        String aadhar= sc.nextLine();

    }
}

class Excecution implements Runnable{
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Details are being processed");
            for(int j=0;j<2;j++){
                System.out.println("Payment is Successful");
            }
        }
    }
}
public class ThreadFunctions {
    public static void main(String[] args) {
        Details d=new Details();
        Excecution e=new Excecution();
        System.out.println("Main thread is Started");
        Thread t1=new Thread(d);
        Thread t2=new Thread(e);
        System.out.println(Thread.currentThread().getName());// get the name of the current thread
        
        System.out.println(t1.isAlive()); //here it return false because thread is not started yet because we have not called the start method yet.
        System.out.println(t2.isAlive()); //here it return false because thread is not started yet because we have not called the start method yet.

        t1.start();
        t2.start();
        System.out.println(t1.isAlive()); // here it return true because thread is started now because we have called the start method.
        System.out.println(t2.isAlive()); // here it return true because thread is started now because we have called the start method.
        
        try{
        t1.join(); // this method is used to wait for the thread to die. It means main thread will wait until t1 thread is completed.
        t2.join(); // this method is used to wait for the thread to die. It means main thread will wait until t2 thread is completed.
        } catch (InterruptedException e1){
            e1.printStackTrace();
        }

        System.out.println("Main thread is ended");
    }
}
        