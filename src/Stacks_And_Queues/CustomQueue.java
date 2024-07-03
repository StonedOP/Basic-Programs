package Stacks_And_Queues;
//in queues items are inserted at the end
public class CustomQueue {
    private int [] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    public CustomQueue (){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int val){
        if (isFull()){
            return false;
        }
        data[end++]= val;
        return true;
    }
    //in queues item is removed at the first index
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("is empty");
        }
        //we display the item that is removed
        int removed = data[0];
        //now we have to shift the items inside the queue by step back
        //i.e. index 1 moves to 0 so loop starts from 1 to end
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public int end() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[end];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <-");
        }
        System.out.println("END");
    }
}
