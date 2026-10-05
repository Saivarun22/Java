import java.util.*;

class Farmer{
    Float LoanAmount;
    Float Period;
    Float SimpleIntrest;

    static Float IntrestRate=3.14f;

    void Display(){
        System.out.println("Welcome to Farmer Loan System");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Loan amount");
        LoanAmount=sc.nextFloat();
        System.out.println("Enter Time Period");
        Period=sc.nextFloat();
    }

    void CalculateSimpleIntrest(){
        SimpleIntrest=(LoanAmount*Period*IntrestRate)/100.f;
    }

    void DisplaySimpleIntrest(){
        System.out.println("Your Interest Amount  Is: " + SimpleIntrest);
    }

}public class FarmerLoanSystem {
    public static void main (String []args){
        Farmer f1= new Farmer();
        Farmer f2 =new Farmer();
        Farmer f3 =new Farmer();

        f1.Display();
        f1.CalculateSimpleIntrest();
        f1.DisplaySimpleIntrest();

        f2.Display();
        f2.CalculateSimpleIntrest();;
        f2.DisplaySimpleIntrest();

        f3.Display();
        f3.CalculateSimpleIntrest();;
        f3.DisplaySimpleIntrest();
    }
    
}
