public class BalancedTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(4);
        root.right = new Node(6);                                      //         10
        root.left.right = new Node(4);                               //     4           6
        root.right.left = new Node(2);                               //        4     2     1
        root.right.right = new Node(1);
        root.right.right.right = new Node(2);
        root.right.right.right.right = new Node(2);
        //	Node root = new Node();
        if(isBalanced(root) == -1)
            System.out.println("Not Follows");
        else
            System.out.println("follows");


        
    }

    public static int isBalanced(Node root){
        if(root == null)
            return 0;
        int lh = isBalanced(root.left);
        if(lh == -1){return -1;}
        int rh = isBalanced(root.right);
        if(rh == -1){return -1;}
        if(Math.abs(lh-rh)>1)
            return -1;
        else
            return Math.max(lh,rh)+1;
    }
}
