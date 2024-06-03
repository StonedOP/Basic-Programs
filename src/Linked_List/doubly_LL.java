package Linked_List;

public class doubly_LL {
    private Node head;
    private int size;


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null){
            head.prev = node;
            size++;
        }
        head = node;
        size++;
    }

    public void display (){
        Node node = head;
        while(node != null) {
            System.out.print(node.val + "->");
            node = node.next;
        }
        System.out.print("End");
    }
    //display reverse
    public void reverseDisplay (){
        Node node = head;
        Node last = null;
// here we have to take the node to iterate through the list till end
        while (node != null){
            // we assign the node value to the var last before the node becomes null so that last points to last node
            last = node;
            node = node.next;
        }
        System.out.println();
        System.out.println("Print in reverse");
        while (last != null){
            System.out.print(last.val + "<-");
            last = last.prev;
        }
        System.out.print("Start");
    }
    public void otherWay(){
        Node node = head;
        while (node.next != null){
            node = node.next;
        }
        System.out.println();
        System.out.println("Print In Reverse");
        while (node != null){
            System.out.print(node.val + "<-");
            node = node.prev;
        }
        System.out.print("Start");
    }
    //insert at last
    public void insertLast(int val){
        Node node1 = new Node(val);
        Node node = head;

        node1.next = null;

        if (head == null){
            node1.prev = null;
            head = node1;
            return;
        }
        while (node.next != null){
            node = node.next;
        }
        node.next = node1;
        node1.prev = node;
        size ++;
    }
    //insert with the value will be same as in LL
    //but to insert with the value of node
    public Node find(int value){ // this will be used to find the node by its value
        Node node = head;
        while (node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    //we insert after the  value of a nod in doubly linked list
    public void insertAfter(int after, int val){
        Node p = find(after);
        Node node = new Node(val);
        if (p == null){
            System.out.println("node  doesn't exist");
            return;
        }
        //node next to the new node can be used from the node p as p.next
        node.next = p.next; //here we have used the node p.next to assign it as the next value to new node
        //so now we change the p.next value as it should point to the new created node
        p.next = node;
        //now we update the new node's pointer that  points to the previous node which should be p
        node.prev = p;
        // now because we have no reference variable to the node present next to the new node
//this means previous of node.next and this nod.next can be null, so we add a check
        if (node.next != null){
            node.next.prev = node;
        }
        size++;
    }

    public class Node{
        int val;

        Node next;

        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}

