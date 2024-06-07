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
    //used in Questions Package LinkedList_revLL-etc
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



                                //BUBBLE SORT
    public void bubbleSort(){
        bubbleSort(size -1 , 0);
    }
//helper method to make recursion call
    //we iterate through the list by using col and row , size -1 in row and col as 0 and
    // we put a condition to check the list by the times of its size, we reduce the row after every pass
    private void bubbleSort(int row, int col) {
        if (row == 0){
            return;
        }
        //we check 2 elements at a time by the size to the list so by then end of 1 iteration min will be at end
        if (col < row){
            //when all col are checked we decrease the roe by one and by doing so
            // last element that is the max will not be checked twice
            Node first = get(col);
            Node second = get(col + 1);

            if (first.value > second.value){
            //we check for the col and then in else condition  keep checking for col +1 by recursion and swap
                //here we swap, we have 3 cases to swap the elements
               if (first == head){
                   head = second;
                   first.next = second.next;
                   second.next = first;
               } else if (second == tail) {
            //we need the previous node to the current col we are at
                   Node prev = get(col -1);
                   prev.next = second;
                   tail = first;

                   first.next = null;
                   //also we have to update the tail
                   second.next = tail;
               }else {//swap in middle
                   Node prev = get(col -1);
                   prev.next = second;
                   //now i will update the next of first coz we have the that value
                   first.next = second.next;
                   //now we change the next of second as second is smaller than first
                   second.next = first;
               }
            }//this is where 2 elements will be swapped ,so we call the check for next 2
            bubbleSort(row, col +1);
        }else {
            //this is where the min element will be at last, so we exclude that by reducing the row length
            bubbleSort(row - 1, 0);//the next iteration starts here
        }
    }

                        //reverse a linked list by recursion
    private void reverse(Node node){
        if(node == tail){//this is the base condition
            head = tail;
            return;
        }
        // now we keep calling the fun to reach the end of the list
        reverse(node.next); //at the end tail will become head
//now after this function will start moving outwards
        tail.next = node;
        tail = node;

        tail.next = null;
    }


                            //InPlace reversal of linked list
                            //when only head is provided
    // to do that we will use 3 pointers prev pointing to null , a present and a next
    public void inPlaceRev(Node head){
        if(size < 2){
            return;
        }

        Node present = head;
        Node prev = null;
        Node next = present.next;

        while(present != null){//in the end when the condition will hit prev will be equal to last node
            present.next = prev;
            prev = present;
            present = next;
            //we need to put a null pointer check for next
            if (next != null){
                next = next.next;
            }
        }//in the end prev will lie at the end
        head = prev;
    }
}
