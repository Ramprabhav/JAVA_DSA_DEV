public class linkedList {
    public static class Node{
     int data;
     Node next;
     public Node(int data){
        this.data=data;
        this.next=null;
     }
    }
    public static Node head;
    public static Node tail;
    public static  void printlinkedlist(){
      tail=head;
      while (tail!=null) {
        System.out.println(tail.data);
        tail=tail.next;
        
      }
    }
      public  static void addfirst(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=tail=newNode;
            return ;
        }
        newNode.next=head;
        head=newNode;
      }
      public static void addlast(int data){
        Node newNode= new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
            
        }
        tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=newNode;
        newNode.next=null;
      }
      public static void addmidle(int index,int data){
        Node temp=head;
        Node newnNode=new Node(data);
        int i=0;
        
        while (i<index-1) {
            temp=temp.next;
            i++;
            
        }
        newnNode.next=temp.next;
        temp.next=newnNode;
      }

    
    public static void main(String args[]){
        linkedList ll=new linkedList();
        ll.head=new Node(1);
        ll.head.next=new Node(2);
        System.out.println("at first index");
        ll.addfirst(20);
        ll.printlinkedlist();
        System.out.println("at first index");
        ll.addfirst(100);
        ll.printlinkedlist();
        System.out.println("at last index");
        ll.addlast(300);
        ll.printlinkedlist();
        ll.addmidle(2,9);
        ll.printlinkedlist();

    }
    
}
