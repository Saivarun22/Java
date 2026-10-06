import java.util.*;

/*if-else is used for normal decision-making and validation, while Exception Handling is used to 
 handle exceptional situations that occur during program execution. */
// class ATM{
//     private int AccountNumber =1523;
//     private int Pin = 6985 ;

//     public void input(){
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter Your Account Number");
//         int AN=sc.nextInt();
//         System.out.println("Enter Your ATM Pin");
//         int P=sc.nextInt();

//         Validating(AN,P);

//     }

//     public void  Validating(int AN,int P){
//         if(AccountNumber==AN &&  Pin==P){
//             Scanner sc= new Scanner(System.in);
//             System.out.println("Enter the Amount to Withdrow");
//             int Amount=sc.nextInt();
//             int Limit=20000;
//             System.out.println("ENter From which Account you want to Withdrow");
//             System.out.println("1.Saving Account");
//             System.out.println("2.Current Account");
//             int choice=sc.nextInt();
//             if(choice==1){
//                 if(Amount<=Limit){
//                 System.out.println("Withdrow Successful");
//             }
//             else{
//                 System.out.println("You are Exceeding the Limit of 20000");
//             }
//             }
//             else if(choice==2){
//                 if(Amount<=Limit){
//                     System.out.println("Withdrow Successful");
//                 }
//                 else{
//                     System.out.println("You are Exceeding the Limit of 20000");
//                 }

//             }else{
//                 System.out.println("Please Enter Valid Choice");
//             }
//         }
//         else{

//             System.out.println("Please Enter Vallid Account Number and Pin");
//         }
//     }
// }

// class Bank{

//     public void bankValidtaing(){
//         ATM atm = new ATM();
//         atm.input();
        
//     }

// }
// public class Launch6{
//     public static void main(String [] args){
//         Bank bank = new Bank();
//         bank.bankValidtaing();
//     }
// }


class  InvalidAccountNumberException extends Exception{
    public InvalidAccountNumberException(String str){
        super(str);
    }
}

class AmountExceedingLimitException extends Exception{
    public AmountExceedingLimitException(String str){
        super(str);
    }
}
class ATM{
    private int AccountNumber =1523;
    private int Pin = 6985 ;

    public void input() throws InvalidAccountNumberException, AmountExceedingLimitException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Account Number");
        int AN=sc.nextInt();
        System.out.println("Enter Your ATM Pin");
        int P=sc.nextInt();

        Validating(AN,P);

    }

    public void  Validating(int AN,int P) throws InvalidAccountNumberException,AmountExceedingLimitException{ 
        if(AccountNumber==AN &&  Pin==P){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Amount to Withdrow");
            int Amount=sc.nextInt();
            int Limit=20000;
            System.out.println("ENter From which Account you want to Withdrow");
            System.out.println("1.Saving Account");
            System.out.println("2.Current Account");
            int choice=sc.nextInt();
            if(choice==1){
                if(Amount<=Limit){
                System.out.println("Withdrow Successful");
            }
            else{
                System.out.println("You are Exceeding the Limit of 20000");
                throw new AmountExceedingLimitException("You are Exceeding the Limit of 20000");
            }
            }
            else if(choice==2){
                if(Amount<=Limit){
                    System.out.println("Withdrow Successful");
                }
                else{
                    System.out.println("You are Exceeding the Limit of 20000");
                    throw new AmountExceedingLimitException("You are Exceeding the Limit of 20000");
                }

            }else{
                System.out.println("Please Enter Valid Choice");
            }
        }
        else{

            throw new InvalidAccountNumberException("Please Enter Vallid Account Number and Pin");
        }
    }
}

class Bank{

    public void bankValidtaing(){
        ATM atm = new ATM();
        try{
        atm.input();
        }catch(InvalidAccountNumberException  | AmountExceedingLimitException a){
            System.out.println(a.getMessage());
            try{
                atm.input();
            }catch(InvalidAccountNumberException  | AmountExceedingLimitException a1){
                System.out.println(a1.getMessage());
                try{
                    atm.input();
                }catch(InvalidAccountNumberException  | AmountExceedingLimitException a2){
                   
                    System.out.println(a2.getMessage());
                    System.out.println("You have exceeded the maximum number of attempts. Please try again later.");
                }
            }
        }

        
    }

}
public class Launch6{
    public static void main(String [] args){
        Bank bank = new Bank();

        bank.bankValidtaing();
    }
}


