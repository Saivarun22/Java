import java.util.*;
class Producer extends Thread{

    Queue q;

    public Producer( Queue q){
       
        this.q=q;

    }
    public void run(){
        int i=1;
        while(true){
            q.put(i++);
        }
    }

}
class Consumer  extends Thread{

    Queue q ;

    public Consumer (Queue q){

        this.q=q;
    }

    public void run(){

        while(true){

            q.get();
        }

    }

}
class Queue{
    int i;
    boolean flag=false;

    public synchronized void put(int x){

        i= x;
        try{
            if(flag==true){
                wait();
            }
            else {
                System.out.println("Produer is producing : "+ x);
                flag =true;
                notify();

            }
        }catch(Exception e){

            System.out.println(".");
            
        }
        

    }
    public  synchronized void get(){

        try{
             if(flag==false){
                wait();
             }
             else{
                System.out.println("Consumer is Consuming : "+ i);
                flag=false;
                notify();
             }
        }catch(Exception e){
            System.out.println(".");
        }

        
    }

}
public class InterCommunication{
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c =  new Consumer(q);

        p.start();
        c.start();
        
    }
}