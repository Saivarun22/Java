import java.util.*;
public class Launch4{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        try{
            System.out.println("Outer Try-Catch Block");
        try{
        System.out.println("Enter Numerator of the Division Function:");
        int num1=sc.nextInt();
        System.out.println("Enter Denominator of the Divison Function: ");
        int num2=sc.nextInt();
        int result =num1/num2;
        System.out.println("Result of Division is : "+result);
        }
        catch (NegativeArraySizeException e){
            System.out.println("Please Enter Positive Index Values "+e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("Exception Handiled in Inner Try Block");
        }
    }
    catch(ArithmeticException e){
        System.out.println("Please Enter Non Zero Values "+e.getMessage());
    }
    catch(Exception e){
        System.out.println("Please Enter Valid Values "+e.getMessage());
    }
    finally{
        System.out.println("Exception Handiled in Outer Try Block");
    }
        
    }




    

}