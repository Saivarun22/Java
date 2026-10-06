import java .util.*;
class UnderAgeException extends Exception{
    public UnderAgeException(String str){
        super(str);
    }
}
class OverAgeException extends Exception{
    public OverAgeException(String str){
        super(str);
    }
}

class Age{
    public void input() throws UnderAgeException, OverAgeException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age =sc.nextInt();
        if(age<18){
            throw new UnderAgeException("You are Under Age");
        }
        else if(age>60){
            throw new OverAgeException("You are Over Age");
        }
        else{
            System.out.println("You are Eligible for Voting");
        }
    }

}
class VotingStaff{
    public void input() {
        Age age = new Age();
        try{
            age.input();
        }
        catch(UnderAgeException | OverAgeException e){
            System.out.println(e.getMessage());

            try{
                age.input();
            }
            catch(UnderAgeException | OverAgeException e1){
                System.out.println(e1.getMessage());
                System.out.println("You have exceeded the maximum number of attempts. Please try again later.");

            }
        }
    }
}
public class Launch7{
    public static void main(String [] args){
        VotingStaff votingStaff = new VotingStaff();
        votingStaff.input();
    
    }
}