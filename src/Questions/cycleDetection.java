package Questions;

import OOPs5.abstractDemo.Parent;

//we create a linked list and then brute force a cycle into it
public class cycleDetection {

    //method to create a cycle at a particular value of a node
    public void createCycle(int val){
        Node temp = head;
        while (temp.val != val){
            temp = temp.next;
        }
        tail.next = temp;
    }
    //method to detect cycle
    public static boolean hasCycle(cycleDetection list) {
        Node fast = list.head;
        Node slow = list.head;

        while (fast != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    //method to calculate the length of the cycle
    public static int lengthOFcycle(cycleDetection list){
        Node fast = list.head;
        Node slow = list.head;
        while(fast != null && fast.next != null){
            fast =  fast.next.next;
            slow = slow.next;
            if (fast == slow){
        //here we calculate the length of cycle, so after both pointers meet we make them run in 1 more loop
//with counter that increases with every step but to implement this while condition we have to run this loop at least
            //once so we use do{}while() loop
                Node temp = slow;
                int length = 0;
                do{
                    temp= temp.next;
                    length++;
                }while (temp != slow);
                return length;
            }
        }
        //we return -1 if no cycle is found
        return -1;
    }
    //to return the node value where the cycle is starting
    public static int StartCycleDetection(cycleDetection list){
        int length = lengthOFcycle(list);
        if (length <= 0){
            System.out.print("there is no cycle present in the list, so Length is ->");
            return -1;
        }
        Node f = list.head;
        Node s = list.head;

        while(length > 0){
//HERE we move the second pointer ahead by the length of cycle , so when we move them together they will meet at start
            s = s.next;
            length--;
        }
        while (s != f){
            s = s.next;
            f= f.next;
        }
        System.out.print("Node form where the cycle is started is ->");
        return s.val;
    }

    public static Node middleOfLinked(cycleDetection list){
        Node fast = list.head;
        Node slow = list.head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static int deleteNode(cycleDetection list){
        Node del = middleOfLinked(list);
        Node temp = list.head;
        while (temp.next != del){
            temp = temp.next;
        }
        temp.next = del.next;
        return del.val;
    }


    // to create a custom linked list
    protected Node head;

    protected Node tail;
    //constructor to initialise the list object
    public cycleDetection() {

        }
    public void insertLast(int value){
        if (tail == null){
            insert(value);
            return;
        }

        Node  temp = new Node(value);
        tail.next = temp;
        tail = temp;

        }
    public void insert(int value) {
            Node node = new Node(value);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = head;
            }
        }
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.print("END");
        }


    public static String toString(Node node) {
        return "value on Node is= " + node.val;
    }

    protected class Node {

        int val;

        Node next;

        public Node(int val) {
            this.val = val;
        }
    }



                                    //reverse a linked list between the given index or nodes
    public Node reverseBetween(Node head, int left, int right){
        if (left == right){
            return head;
        }
        //skip the first (left -1) nodes and check for null pointer
//will start from current as head and prev as null
        Node current = head;
        Node prev = null;
        for (int i = 0;  current != null && i < left -1; i++) {
    //when this loop ends the current will be at the left index and prev at left -1 index
            prev = current;
            current = current.next;
        }
        //now for the reversing part between left and right

        Node last = prev;
        Node newEnd = current;
    //we need a variable that holds the current.next value
        Node next = current.next;
//we use a for loop as we want to reverse the nodes given in the limit
        for (int i = 0; current!= null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }
        if (last != null){
        //after the reversal of the inner list the node outside of it will be pointing to node of reversed list
            last.next = prev;
        }else {//if the list that we want to reverse starts from the node at index of left

            head = prev;
        }
//newEnd will be the last in the reversed list and the current is at the end of whole at this point, so we update
        newEnd.next = current;
        return head;
    }

    public Node rev(Node node){
        if (node == tail){
            head = tail;
            return node;
        }
        rev(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
        return node;
    }
    public Node revforP(Node node){
        if (node == null){
            return node;
        }
        Node current = node;
        Node prev = null;
        Node next = current.next;

        while (current != null){
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }
        node = prev;
        return node;
    }
                    //palindrome Linked List
    //if we read the linked list from start to middle and middle to end then it should be same
    //the idea is -- we find the middle and reverse the linked list to traverse it and then re reverse it

       public Node middle(Node head){
        Node midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head= head.next.next;
        }
        Node mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    public boolean palindrome(cycleDetection list){
        Node start = head ;
        Node mid = middleOfLinked(list);
        Node reverseSecond = revforP(mid);
        //we have top re reverse it, so we store this variable
        Node reReverseHead = reverseSecond;
        //now compare both half
        while(start != null && reverseSecond != null){
            if (start.val != reverseSecond.val){ // it means not a palindrome
                break;
            }
            start = start.next;
            reverseSecond = reverseSecond.next;
        }

        revforP(reReverseHead);
        //if we were able to traverse through the list without hitting a break its is palindrome
        return start == null || reverseSecond == null;

    }


    // REORDER list as 1st -> last -> 2nd -> 2ndLast -> 3rd -> 3rdLast
        //because we can't move backwards we reverse the half of the list and then reorder it
    public void reorder(Node node){
        if (node == null || node.next == null){
            return;
        }
        Node mid = middle(node);
        Node hf = node;
        Node hs = revforP(node);

        while(hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }
        //this sets next of tail to null
        if(hf != null){
            hf.next = null;
        }
    }



    //reverse every group of size k
    public Node revKgroup (Node node, int k){
        if (k <= 1 || node == null) {
            return node;
        }
        Node current = head;
        Node prev = null;
        //we run a infinite while loop
        while (true){
            Node last = prev;
            Node newEnd = current;
            Node next = current.next;

            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;
                if(next != null){
                    next = next.next;
                }
            }
            if(last != null){
                last.next = prev;
            }else{
                node = prev;
            }
            newEnd.next = current;
            if(current == null){
              break;
            }
        }
        return node;
    }



        public static void main(String[] args) {
            cycleDetection list = new cycleDetection();
            list.insert(1);
            list.insert(2);
            list.insert(6);
            list.insert(82);
            list.insert(23);
            list.insert(5);
            list.insert(63);
            list.insert(26);
            list.insert(76);
            list.insertLast(666);
            list.display();
            list.createCycle(23);
            System.out.println();

            System.out.println(hasCycle(list));
            System.out.println(StartCycleDetection(list));

            System.out.println(subClass.happyNumber(19));

            cycleDetection list2 = new cycleDetection();
            list2.insert(23);
            list2.insert(5);
            list2.insert(63);
            list2.insert(26);
            list2.insert(76);

            System.out.println(toString(middleOfLinked(list2)));
            System.out.println(deleteNode(list2));;


            cycleDetection list3 = new cycleDetection();
            list3.insert(1);
            list3.insertLast(2);
//            list3.insertLast(3);
//            list3.insertLast(4);
//            list3.insertLast(4);
//            list3.insertLast(3);
            list3.insertLast(2);
            list3.insertLast(1);
            list3.display();
            System.out.println(list3.palindrome(list3));
    }

}
class subClass{
    public static void main(String[] args) {

    }

    // Happy Number - fro a +ve int we replace the no. with the sum of the square of its digits
    // eg 19 = (1)^2 + (9)^2 = 82, => (8)^2 + (2)^2
    //so this loop will only end if the number becomes 1

    public static boolean happyNumber(int n){
        int s = n;
        int f = n;
        do{
            s = square(s);
            f = square(square(f));
        }while (s != f);
        if( s == 1){
            return true;
        }
        return false;
    }
    //sum of square of digits
    public static int square(int n){
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            ans += rem * rem;
            n/=10;
        }
        return ans;
    }

                            //question reverse a linked list

}