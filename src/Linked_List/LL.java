package Linked_List;

public class LL {
    protected Node head;
    protected Node tail;
    private int size;
//constructor
    public LL() {

        this.size = 0;
    }
    //insert first element in empty linked list
    public void insertFirst(int value){
        // first we'll create a new node
        Node node = new Node(value);
    //we will follow the steps on pen and paper i.e. create a node, point its next to the head, then make it head
        node.next = head;
        head = node;
        //if there is only one node then head and tail both will point to same node
        if(tail == null){
            tail = head;
        }//now that we have updated every thing we maintain the size by increasing it
        size += 1;
    }
        //display  function we use temp node to print values
    public void display (){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("end");
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

//insert
    public void insert(int value, int index) throws Exception {
        if(index > size){
            throw new Exception("Index out of bounds");
        }
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        Node temp = new Node(value, node.next);
        node.next = temp;
        size++;

    }
    //delete first
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    //delete last
    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;  // val is equal to the removed value
    //here i need to change the tail to the second last node w
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //delete an index
    public int deleteIndex(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteLast();
        }
        Node node = get(index - 1);
        int val = node.next.value;
        node.next = node.next.next;
        size--;
        return val;
    }
//method to get the node by searching its  value
    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value != value){
                node = node.next;
            }else{
                return node;
            }
        }
        return null;
    }

    // this linked list has a class called Node, so we make it as a private class
    protected class Node{
        private int value;

        Node next;
        public Node(int value) {

            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    // if tail and size of a linked list is not given we use recursion
    //insertion using recursion a particular value at particular index
//there are 2 observations while using recursion in linked list
//1-> have a void return type and make changes in list
//2-> have a node return type that returns the list node to change the structure
// one to iterate via index we pass the index that we want to change and reduce it till its zero

    // coz we start from head , when the index will be zero it will be the node we want to change
    public void insertRec(int value , int index){
//we start from head till we reach the index 0
        head = insertRec(value,index, head);

    }
    private Node insertRec(int value , int index, Node currentNode) {
        // base condition will hit when the index will be zero
        if(index == 0){
// we create the node we want to add, increase the size and return the node we are at
            Node temp = new Node(value);
            size++;
            return temp;
        }
// in the function POINT 1 -> we will start from head and keep decreasing the index till we reach zero
        //we make recursion call to reduce index and when we are doing, so we will pass the node.next in the rec call
        // so that when next call is made it will have that .next value of the node in currentNode
        //so this curentNode.next in the recursion call to keep updating the node in the future calls
        //and because this recursion call is returning the Node so to keep the structure and add the new node when the
        // condition is hit currentNode.next will be equal to the Node returned from future calls
        currentNode.next = insertRec(value, index - 1, currentNode.next);
        return currentNode;
    }


                                            //question
//removing duplicates from a sorted linked list
    public void duplicates(){
        Node node = head;
        while (node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    //merging 2 sorted linked lists
    public LL merge(LL first , LL second){
        Node f = first.head;
        Node s = second.head;
        LL ans = new LL();
        while (f.next != null && s.next != null){
            if(f.value < s.value){
                ans.insertLast(s.value);
                s = s.next;
            }else {
                ans.insertLast(f.value);
                f = f.next;
            }
        }
// at this point f or s has traversed through the list so only one will be left, so we add all of its elements
        while (f.next != null){
            ans.insertLast(f.value);
            f =f.next;
        }
        while (s.next != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }
}
