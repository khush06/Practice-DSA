package linkedLists;

public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }

    public void printList(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
    }

    public void recursiveLL(Node head){
        if(head == null)
            return;
        System.out.println(head.data + " ");
        recursiveLL(head.next);
    }

    public void insertAtBeginning(int x,Node head){
        if(head == null){
            head.data = x;
            head.next = null;
        }else{
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
        }
    }
}
