import java.util.*;
enum Result {
    PASS,FAIL,NR;

    Result(){

        System.out.println("Constructor class inteated");

    }
    
    int Score;
    public void setResult(int Score){
        this.Score=Score;

    }
    public int getResult(){
        return Score;
    }

}
public class Practice2{
    public static void main(String args[]){

        Result result1=Result.PASS;
        result1.setResult(78);
        System.out.println(result1.getResult());
        switch(result1){
            case PASS: System.out.println("Student Passed the Exam");
            break;
            case FAIL: System.out.println("Student Failed the Exam");
            break;
            case NR: System.out.println("No Result");
        }
        }
    }
    