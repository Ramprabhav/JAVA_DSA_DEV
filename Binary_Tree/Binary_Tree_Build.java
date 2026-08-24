import java.util.LinkedList;
import java.util.Queue;

public class Binary_Tree_Build {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int ind = -1;
        public static Node buildTree(int [] node){
            ind++;
         if (node[ind] == -1) {
            return null;
         }
         Node newNode = new Node(node[ind]);
         newNode.left = buildTree(node);
         newNode.right = buildTree(node);
         return newNode;

        }

        //preorder traversal

        public static void preorder(Node root) {
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        //inorder traversal
        

        public static void inorder(Node root) {
            if(root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        //postOrder traversal

        public static void postorder(Node root) {
          if(root == null) {
            return;
          }

          postorder(root.left);
          postorder(root.right);
          System.out.print(root.data + " ");
        }

        //level order traversal

        public static void levelOrderTraversal(Node root) {
            if(root == null){
                return;
            }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(currNode);
                }
            }else{

                System.out.print(currNode.data+" ");

                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            
        }

        }

        //height of tree

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int left = height(root.left);
            int right = height(root.right);
            int h = Math.max(left, right) + 1;

            return h;
        }
    }

    public static void main(String [] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt =new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.println(root.data);
       System.out.println("preorder traversal");
        bt.preorder(root);

        System.out.println("inorder traversal"); 
        System.out.println();
        bt.inorder(root);

        System.out.println("postorder traversal");
        System.out.println();
        bt.postorder(root);

        System.out.println("Level order traversal");

        bt.levelOrderTraversal(root);

        System.out.println("hight is: " + bt.height(root));
    }
}
