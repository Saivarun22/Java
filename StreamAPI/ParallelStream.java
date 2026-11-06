import java.util.*;
public class ParallelStream{
    public static void main(String args[]){

        ArrayList <Integer> list = new  ArrayList<>();
        for(int i=1;i<=10000;i++){
            list.add(i);

        }

        Long startTime =System.currentTimeMillis();

        int regularstream =list.stream()
                        .filter(i->i%2==0)
                        .mapToInt(i->i)
                        .sum();

        Long endTime = System.currentTimeMillis();
        System.out.println(regularstream + "  Regular Stream Time: " + (endTime - startTime));

        Long startTime1 =System.currentTimeMillis();

        int parallelstream =list.parallelStream()
                        .filter(i->i%2==0)
                        .mapToInt(i->i)
                        .sum();

        Long endTime1 = System.currentTimeMillis();
        System.out.println( parallelstream +"  Parallel Stream Time: " + (endTime1 - startTime1));

    }
}