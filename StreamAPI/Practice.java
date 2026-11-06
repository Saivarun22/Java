import java .util.*;
public class Practice{
    public static void main (String args[]){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,2,8,6,7,4,6,5,3,1));
        list.stream().forEach(i->System.out.println(i));

        int result =list.stream()
                     .filter(i->i%2==0 && i>3)
                     .map(i->i*2)
                     .reduce(0,(c,e)->c+e);
        System.out.println(result);

//         Consumer<Integer> con=new Consumer<Integer>(){
//             public void accept(Integer t){
//                 System.out.println(t);

//             }
//         };

//         Predicate<Integer> pre=new Predicate<Integer>(){
//             public boolean test(Integer t){
//                 return t%2==0;

//             }
//         };

//         Function<Integer,Integer> fun = new Function <Integer,Integer>(){
//             public Integer apply(Integer t){
//                 return t*2;
//             }
//         };

//         BinaryOperator <Integer> bin = new BinaryOperator<Integer>(){
//             public Integer apply(Integer c,Integer e){
//                 return c+e;
//             }
//         };



    }
 }