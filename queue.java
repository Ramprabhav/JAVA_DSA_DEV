public class queue {
    Static class Que{
        static int arr[];
        static int size;
        static int rear;
        Que(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //add element
        public static void add(int data){
            if (rear==size-1) {
                Sustem.out.println("queue is full so you can not insert any element");
                return;
            }
            rear=rear+1;
            arr[rear]=data;


        }
        //remove element
        public static int remove(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            remove front;

        }
        //peek
        public static  int peek(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String [] args){
        Que q=new Que();
        q.add(4);
        q.add(6);
        q.add(2);
        q.add(41);
        q.add(40);
        
    }
    
}
