import java.util.*;
public class Queue_implementation_with_stack {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }


    //add element
    public static void add(int data){
       while(!s1.isEmpty()){
        s2.push(s1.pop());
       }

       s1.push(data);
       while (!s2.isEmpty()) {
        s1.push(s2.pop());
       }
    }

    //remove element

    public static int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }

    //peek function

    public static int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }
    
    // Print queue
    public static void printQueue() {

        Stack<Integer> temp = new Stack<>();

        while (!s1.isEmpty()) {
            int value = s1.pop();
            System.out.print(value + " ");
            temp.push(value);
        }

        while (!temp.isEmpty()) {
            s1.push(temp.pop());
        }

        System.out.println();
    }

    public static void main(String args[]){
       Queue_implementation_with_stack q=new Queue_implementation_with_stack();
       q.add(10);
       q.add(29);
       q.add(30); 
       q.add(36);
       q.add(40);
       q.add(45);
       q.printQueue();

       q.remove();
       q.printQueue();
       
    }

}
