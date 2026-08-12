public class linkedList {

    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int size = 0;
    public static Node head;
    public static Node tail;

    // Print Linked List
    public static void printlinkedlist() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // Add at First
    public static void addfirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add at Last
    public static void addlast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Add at Middle / Given Index
    public static void addmiddle(int index, int data) {

        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addfirst(data);
            return;
        }

        if (index == size) {
            addlast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    // Delete First Node
    public static void deletefirstnode() {

        if (head == null) {
            return;
        }

        // Only one node
        if (head == tail) {
            head = tail = null;
            size = 0;
            return;
        }

        head = head.next;
        size--;
    }

    // Delete Last Node
    public static void deletelastnode() {

        if (head == null) {
            return;
        }

        // Only one node
        if (head == tail) {
            head = tail = null;
            size = 0;
            return;
        }

        Node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        size--;
    }

    // Reverse Linked List
    public static void reverseLinkedList() {

        Node temp = head;
        Node prev = null;

        // Old head becomes new tail
        tail = head;

        while (temp != null) {

            Node next = temp.next;

            temp.next = prev;

            prev = temp;
            temp = next;
        }

        head = prev;
    }

    // Nth Node From End
    public static void nthNodeFromEnd(int nth) {

        if (nth <= 0 || nth > size) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;

        for (int i = 1; i <= size - nth; i++) {
            temp = temp.next;
        }

        System.out.println(temp.data);
    }

    // Detect Cycle in Linked List
    public static boolean cycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // Find Middle Node
    public static Node findMid(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Check Whether Linked List Is Palindrome
    public static boolean isPalindrom(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Find middle
        Node mid = findMid(head);

        // Reverse second half
        Node prev = null;
        Node temp = mid;

        while (temp != null) {

            Node next = temp.next;

            temp.next = prev;

            prev = temp;
            temp = next;
        }

        Node right = prev;
        Node left = head;

        boolean result = true;

        // Compare first half and reversed second half
        while (right != null) {

            if (left.data != right.data) {
                result = false;
                break;
            }

            left = left.next;
            right = right.next;
        }

        // Restore second half
        temp = prev;
        prev = null;

        while (temp != null) {

            Node next = temp.next;

            temp.next = prev;

            prev = temp;
            temp = next;
        }

        return result;
    }

    // Remove Cycle
    public static void removeCycle() {

        Node slow = head;
        Node fast = head;

        boolean cycle = false;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        // No cycle
        if (!cycle) {
            return;
        }

        // Step 2: Find starting point of cycle
        slow = head;
        Node prev = null;

        while (slow != fast) {

            prev = fast;

            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle
        prev.next = null;

        // Update tail
        tail = prev;
    }

    // Create Cycle for Testing
    public static void createCycle() {

        if (head == null || head.next == null) {
            return;
        }

        tail.next = head.next;
    }

    // Main
    public static void main(String args[]) {

        linkedList ll = new linkedList();

        ll.addfirst(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addlast(7);

        System.out.println("Original Linked List:");
        ll.printlinkedlist();

        System.out.println();

        // Check palindrome
        System.out.println("Is Palindrome: " + isPalindrom(head));

        System.out.println();

        // Create cycle
        ll.createCycle();

        System.out.println("Cycle present: " + ll.cycle(head));

        // Remove cycle
        ll.removeCycle();

        System.out.println("Cycle present after removal: " + ll.cycle(head));

        System.out.println();

        // Print after removing cycle
        System.out.println("Linked List after removing cycle:");
        ll.printlinkedlist();
    }
}