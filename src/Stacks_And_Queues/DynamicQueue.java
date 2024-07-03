package Stacks_And_Queues;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int val){
        super(val);
    }
    @Override
    public boolean insert(int val){
        if(isFull()){
            int[] temp = new int [data.length * 2];
            //we copy the data into temp and then assign it back to data
            for (int i = 0; i < data.length; i++) {
    //while inserting it is possible is that the front in CircularQueue is not at zero it can be anywhere,
    //so we start at front and add (i) while taking modulo
    //so that when the index exceeds the data.length modulo still returns the index
                temp[i] = data[( (front + i) % data.length)];
            }
            //now we reset the pointers
            front = 0;
            end = data.length;
            data = temp;
        }
        //and now we can insert normally isFull() is resolved
        return super.insert(val);
    }
}
