package Stacks_And_Queues;

import java.security.PublicKey;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = 0;
    protected int front = 0;
    private int size = 0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int val){
        if (isFull()){
            return false;
        }
        data[end++] = val;
        end = end % data.length;
        size++;
        return true;
    }
    //we remove the first item at front and move it by one
    public int remove () throws Exception {
        if (isEmpty()){
            throw new Exception(" queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }
    public void display() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        int i = front;
        do{
            System.out.print(data[i] + " ->");
            i++;
            i %= data.length;;
        }while (i!= end);
        System.out.println("END");
    }
}
