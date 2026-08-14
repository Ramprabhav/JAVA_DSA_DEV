public class Implementation_Queue_With_Array {
    static class Queue{
        public static int arr[];
        public static int size;
        public static int rear;

        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty(){
        return rear == -1;
       }
       // add
       public static void add(int data){
        if(rear == size){
            System.out.println("Queue is full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
       }
       //peek
       public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];

       }

       //remove
       public static int remove(){
        if (isEmpty()) {
           System.out.println("Queue is empty"); 
        }
        int front=arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear=rear-1;
        return front;
       }

       //display element

       public static void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is emplty");
            return;
        }
        for(int i=0;i<rear;i++){
            System.out.print(arr[i] + " ");
        }
       }
    }
    
public static void main(String []args){
    Queue q=new Queue(6);
    Queue.add(10);
    Queue.add(20);
    Queue.add(30);
    Queue.add(40);
    Queue.add(50);
    Queue.add(60);

    Queue.printQueue();
    System.out.println("remove element from queue :");
    System.out.println(Queue.remove());

    System.out.println("Peek element of Queue is: " + Queue.peek());
}

}
