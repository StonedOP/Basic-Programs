package Linked_List;

public class CircularLL implements CirLinkedList {
    protected Node head;
    protected Node tail;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }
    @Override
    public void insertFirst(int val){
        Node node = new Node(val);
        if( head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    @Override
//because its circular linked list we will start from head and print till we reach head
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + "->");
                node = node.next;
            }while (node != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int value){
        Node node = head;
        if(node == null){
            return;
        }
        if (node.val == value){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);


    }

    protected class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
