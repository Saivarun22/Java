public class PracticeOverloading {
     public int add(int a,int b){
        return a+b;
    }
    public long add(long a,long b){
        return a+b;
    }
    public  float add(int a, float b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }
    public  double add(double a, double b){
        return a+b;
    }
    public double add (long a,double b){
        return a+b;
    }
    
    public static void main (String[] args){
         PracticeOverloading obj = new PracticeOverloading( );
         System.out.println(obj.add(10,20));
         System.out.println(obj.add(10000000,20.4));
        System.out.println(obj.add(100.4,20.4));

    }
    
}
