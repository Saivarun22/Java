public class DemoPractice {

    int a=10;
    int b=20;
    String Name ="Varun";

    public int add3(){
        return a+b;
        

    }
    
    public int add2(int a,int b){
        return a+b;
        

    }

    public void add1(int a,int b){
        int c= a+b;
        System.out.println("the sum is :"+c);
        

    }

    public void name(String Name){
        System.out.println("my Name is :"+Name);

    }

     public String name2(String Name){
        return Name;

    }

    public void name1(){
        System.out.println("my Name is :"+Name);

    }

    public static void main(String[]args){
          DemoPractice obj=new DemoPractice();
           obj.name("varun");
           obj.add1(10,20);
           System.out.println(obj.add2(10,20));
           obj.add3();
            System.out.println(obj.add3());
           obj.name1();
           System.out.println(obj.name2("varun"));
    } 
        

    
}
