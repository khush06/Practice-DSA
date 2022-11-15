import java.util.LinkedList;
import java.util.Queue;

public class LeftViewTree {
    static int maxLevel = 0;
    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(4);
        root.right = new Node(6);                                      //         10
        root.left.right = new Node(4);                               //     4           6
        root.right.left = new Node(2);                               //        4     2     1
        root.right.right = new Node(1);
        //	Node root = new Node();
       // leftview(root); -- iterative
        leftviewrecursive(root,1);
    }

    public static void leftview(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node curr = null;
        while(q.isEmpty() == false){
            int count = q.size();
            for(int i=0;i<count;i++) {
                curr = q.poll();
                if(i==0) {
                    System.out.println(curr.data);
                }
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
        }
    }

    public static void leftviewrecursive(Node root,int level){
        if(root == null)
            return;
        if(maxLevel < level){
            System.out.println(root.data);
            maxLevel = level;
        }
        leftviewrecursive(root.left,level+1);
        leftviewrecursive(root.right,level+1);
    }
}
