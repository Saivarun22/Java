import java.util.LinkedList;

public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList l1= new LinkedList();
        l1.add(10); //add Function is used to add new element to the list
        l1.add(20);
        l1.add("java");
        l1.add("Launguage");
        System.out.println(l1);
        l1.addFirst("object");  // addFirst Function is used to add element to the Front End
        l1.addLast("Practice"); // addLast Function is used to add element to the Rear End
        System.out.println(l1);
        System.out.println(l1.contains("java")); // Contains Functions is used Weather the Element contains in the List or Not
        System.out.println(l1.get(3));
        l1.offer(60); // it may or maynot add the element in the Front End 
        System.out.println(l1);
        l1.offerFirst(52); // it may or maynot add the element in the Front End 
        System.out.println(l1);
        l1.offerLast(39);  // it may or maynot add the element in the Rear End 
        System.out.println(l1);
        System.out.println(l1.peek()); // return the Front Element in the List 
        System.out.println(l1.peekLast()); // return the Rear Element in the List
        System.out.println(l1.poll()); //return the Front  Element in the List and Remove the Element From The List
        System.out.println(l1);
        System.out.println(l1.pollLast()); //return the Rear  Element in the List and Remove the Element From The List
        System.out.println(l1);
        l1.push("Push the Element 10"); // Add the element in the Front Element
        System.out.println(l1);
        l1.pop(); //Removes the Front Element From The List
        System.out.println(l1);
        
        
    }

}
