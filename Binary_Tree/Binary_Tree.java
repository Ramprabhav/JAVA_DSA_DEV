public class Binary_Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
          this.data = data;
          this.left = null;
          this.right = null;
        }

    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int lc = countNode(root.left);
        int rc = countNode(root.right);
        return lc + rc + 1;
    }

    public static void main(String []args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(3);
        root.left.left.right = new Node(5);
        root.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);

        Binary_Tree bt = new Binary_Tree();
        System.out.println("Number of Node in Tree: " + bt.countNode(root));
    }
}
