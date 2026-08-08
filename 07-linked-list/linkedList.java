public class linkedList {
    public static class Node{
     int data;
     Node next;
     public Node(int data){
        this.data=data;
        this.next=null;
     }
    }
    static int size=0;
    public static Node head;
    public static Node tail;
    public static  void printlinkedlist(){
      Node temp=head;
      while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
        
      }
    }
      public  static void addfirst(int data){
        Node newNode=new Node(data);
        if (head==null) {
            head=tail=newNode;
            size++;
            return ;
        }
        newNode.next=head;
        head=newNode;
        size++;
      }
      public static void addlast(int data){
        Node newNode= new Node(data);
        if (head==null) {
            head=tail=newNode;
            size++;
            return;
            
        }
        tail.next=newNode;
        tail=newNode;
        size++;
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
        size++;
      }

    
    public static void main(String args[]){
        linkedList ll=new linkedList();
        ll.addfirst(10);
        ll.addfirst(25);
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
