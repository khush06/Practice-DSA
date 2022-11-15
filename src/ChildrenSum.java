public class ChildrenSum {
    public static void main(String[] args) {
        // if all the nodes value is sum of its children value
        Node root = new Node(10);
        root.left = new Node(4);
        root.right = new Node(6);                                      //         10
        root.left.right = new Node(4);                               //     4           6
        root.right.left = new Node(2);                               //        4     2     4
        root.right.right = new Node(4);
        //	Node root = new Node();
        if(isChildrenSum(root))
            System.out.println("Follows");
        else
            System.out.println("Not follows");
    }

    public static boolean isChildrenSum(Node root){
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        int sum = 0;
        if(root.left != null)
            sum = sum+root.left.data;
        if(root.right != null)
            sum = sum+root.right.data;

        return (root.data == sum && isChildrenSum(root.left) && isChildrenSum(root.right));
    }
}
