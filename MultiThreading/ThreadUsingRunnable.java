import java.util.* ;
class A implements Runnable {
    public void run(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Profile Details Module Started");
        System.out.println("Enter Your Profile Details");
        System.out.println("Enter Your Name");
        String name =sc.nextLine();
        System.out.println("Enter Your Age");
        int age =sc.nextInt();
        System.out.println("Profile Details Submitted");
    }


}

class B implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Loading Profile Details ... Please Wait");
        }
    }
}

class C implements Runnable{
    public void run(){
        
        System.out.println("Payment Method Started");
        System.out.println("Select Your Payment Method");
        
        for(int i=1;i<=6;i++){
            System.out.println("Processing Payment... Please Wait : " + i +  "Seconds");
            
        }

    
    System.out.println("Payment Method Module Ended");
    }
}

public class ThreadUsingRunnable{
    public static void main (String args[]){

        A a=new A();
        B b=new B();
        C c=new C();
        
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        Thread thread3 = new Thread(c);
        
        thread1.start();
        thread2.start();
        thread3.start();

    }

}