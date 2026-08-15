import java.util.LinkedList;

public class Queue {
    static LinkedList<Integer> ll = new LinkedList<>();
    public static boolean isEmpty(){
        return ll.isEmpty();
    }

    //add function
    public static void add(int data){
     ll.addLast(data);
     return;
    }

    //remove function
    public static int  remove(){
        if (ll.isEmpty()) {
            return -1;
        }
        int data =ll.removeFirst();
        return data;
    }

    //peek function
    public static int peek(){
        if (ll.isEmpty()) {
            return -1;
        }
       return ll.getFirst();
    }
    //display queue
    public static void printQueue(){
        if (ll.isEmpty()) {
            System.out.println("Empty Queue");
        }
        for(int data : ll){
            System.out.println(data);
        }
    }


    public static void main(String [] args){
     Queue q =new Queue();
     q.add(10);
     q.add(20);
     q.add(30);
     q.add(40);
     q.add(50);

     q.printQueue();
     
    

     System.out.println(q.remove());
      System.out.println("after removing");

     q.printQueue();
    }
}
