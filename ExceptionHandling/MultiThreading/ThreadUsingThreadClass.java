import java.util.* ;
class A extends Thread {
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

class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Loading Profile Details ... Please Wait");
        }
    }
}

class C extends Thread{
    public void run(){
        
        System.out.println("Payment Method Started");
        System.out.println("Select Your Payment Method");
        
        for(int i=1;i<=6;i++){
            System.out.println("Processing Payment... Please Wait : " + i +  "Seconds");
            
        }

    
    System.out.println("Payment Method Module Ended");
    }
}

public class ThreadUsingThreadClass{
    public static void main (String args[]){

        A a=new A();
        B b=new B();
        C c=new C();
        
        

        a.start();
        b.start();
        c.start();

    }

}