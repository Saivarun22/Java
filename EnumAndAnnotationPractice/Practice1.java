import java.util.*;
enum Month1{
            JAN,FEB,MAR,API,MAY,JUNE,JULY,AUG,SEP,OCT,NOV,DEC;
        }
public  class Practice1{
    public static void main (String args[]){

        Month1 month1 = Month1.JAN;
         System.out.println(month1);
         System.out.println(month1.ordinal());
         System.out.println(month1.getClass());


         Month1 month2 = Month1.JUNE;
         System.out.println(month2);
         System.out.println(month2.ordinal ());
         System.out.println(month2.getClass());

        

    }
}