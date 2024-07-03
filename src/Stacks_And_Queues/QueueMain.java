package Stacks_And_Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(1);
        queue.insert(78);
        queue.insert(66);
        queue.insert(34);
        queue.insert(56);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println();

        CircularQueue queue1 = new CircularQueue(5);
        queue1.insert(4);
        queue1.insert(8);
        queue1.insert(676);
        queue1.insert(38);
        queue1.insert(21);
        queue1.display();
        System.out.println(queue1.remove());
        queue1.insert(23);
        queue1.display();

        System.out.println(queue1.remove());
        queue.display();

        queue1.insert(98);
        queue1.display();
    }
}
