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
      public static void deletefirstnode(){
        if(head==null){
          size=0;
          return;
        }
        head=head.next;
        size--;
        return ;
      }
      public static void deletelastnode(){
        int i=1;
        Node temp=head;
        while (i<size-1) {
          temp=temp.next;
          
          i++;
        }
        temp.next=null;
        tail=temp;
        size--;
        return;
      }

      //reverse linkedlist
      public static void reverseLinkedList(){
        Node temp=head;
        Node prev=null;
        Node next;
        while (temp!=null) {
          next=temp.next;
          temp.next=prev;
          prev=temp;
          temp=next;
        }
        head=prev;
      }
      public static void nthNodeFromEnd(int nth){
        int i=1;
        Node temp=head;
        while(i<=size-nth){
              temp=temp.next;
              i++;
        }
        System.out.println(temp.data);
        return;
      }
      //detecting cycle in linked list
      public static boolean cycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
          if(slow==fast){
            return true;
          }
          slow=slow.next;
          fast=fast.next.next;
        }
        return false;
      }

      //check whether linkedlist is palindrom 
     public static Node findMid(Node head){
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;
     }

     public static boolean isPalindrom(Node head){
     Node mid=findMid(head);
     Node prev=null;
     Node temp=mid;
     Node next;
     while(temp!=null){
      next=temp.next;
      temp.next=prev;
      prev=temp;
      temp=next;
     }
     Node right=prev;
     Node left=head;
     while(right!=null){
      if (left.data!=right.data) {
        return false;
      }
      left=left.next;
      right=right.next;
     }
     return true;
     }
     
    
    public static void main(String args[]){
        linkedList ll=new linkedList();
        ll.addfirst(1);
         ll.addlast(1);
          ll.addlast(2);
           ll.addlast(2);
            ll.addlast(2);
             ll.addlast(1);
        ll.addlast(1);

        System.out.println(isPalindrom(head));


       /* 
       
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
        System.out.println("After deleting the first node");
        ll.deletefirstnode();
        ll.printlinkedlist();
        System.out.println("after deleting the last node");
        ll.deletelastnode();
        ll.printlinkedlist();
        System.out.println("Reversed LinkedList : ");
      
        ll.reverseLinkedList();
        ll.printlinkedlist();

        System.out.println("nth node form the end : ");
        ll.nthNodeFromEnd(2);

        */
        
       


    }
    
}
