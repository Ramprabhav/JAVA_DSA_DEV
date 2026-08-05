public class Stack_Using_Linkedlist {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class StackLinkedlist{
        static Node head=null;
        
        //check empty function
        public static boolean isEmpty(){
            if (head==null) {
                return true;
            }
         return false;
        }
        //push function
        public static void push(int data){
            Node newNode=new Node(data);
            if (isEmpty()) {
              head=newNode;
              return;
            }
            newNode.next=head;
            head=newNode;
        }
        //pop operation
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        //peek operation
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
        

        

    }
    public static void main(String args[]){
           StackLinkedlist s=new StackLinkedlist();
           s.push(2);
           s.push(10);
           s.push(20);
           s.push(15);
           while(!s.isEmpty()){
            System.out.println(s.peek());;
            s.pop();
           }
          
        }
    
}
