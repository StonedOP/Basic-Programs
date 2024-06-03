package Questions;

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
        if (length == 0){
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
        while (fast != null & fast.next != null){
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

}