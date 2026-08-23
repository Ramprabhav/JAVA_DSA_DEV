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

        public static void preorder(Node root){
            if(root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String [] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt =new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.println(root.data);

        bt.preorder(root);
    }
}
