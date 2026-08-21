public class Circular_Queue {
     static class Queqe{
        public static int [] arr;
        static int size;
        static int rear;
        static int front;
        Queqe(int n){
            arr = new int [n];
            size = n;
            front = -1;
            rear = -1;
        }
       // check whether queue is empty
        public static boolean isEmpty(){
            return front == -1 && rear ==-1;
        }

        //check queue whether queue is full
        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        //add function
        public static void add(int data) {
          if(isFull()){
            System.out.println("Queue ids full");
            return ;
          }
          if(front == -1){
            front = 0;
          }
          rear = (rear+1) % size;
          arr[rear] = data;
        }

        //remove function
        public static int remove() {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int v = arr[front];
           

            if(rear == front) {
                rear = front = -1;
            }else{
             front = (front+1) % size;
            }
            return v;
        }

        //peek function
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String [] args) {
          Queqe q =new Queqe(5);
    q.add(10);
    q.add(20);
    q.add(30);
    q.add(40);
    q.add(50);

    System.out.println(q.peek());    // 10

    System.out.println(q.remove()); // 10
    System.out.println(q.remove()); // 20

    q.add(60);
    q.add(70);

    System.out.println(q.peek());    // 30

    System.out.println(q.remove()); // 30
    System.out.println(q.remove()); // 40
    System.out.println(q.remove()); // 50
    System.out.println(q.remove()); // 60
    System.out.println(q.remove()); // 70

    System.out.println(q.remove()); // Queue is empty
    
    }
    
}
