import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(4);
        root.right = new Node(6);                                      //         10
        root.left.right = new Node(4);                               //     4           6
        root.right.left = new Node(2);                               //        4     2     4
        root.right.right = new Node(1);
        System.out.print(maxWidth(root));

    }
    public static int maxWidth(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int maxW = 0;
        while(q.isEmpty() == false){
            int size = q.size();
            for(int i=0;i<size;i++){
                Node curr = q.poll();
                if(curr.left!=null)
                    q.add(curr.left);
                if (curr.right!=null)
                    q.add(curr.right);
            }
            maxW = Math.max(size,maxW);
        }
        return maxW;
    }
}
