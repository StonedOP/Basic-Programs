package Stacks_And_Queues;


public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // this will call CustomStack() - the constructor that takes no argument
    }

    public DynamicStack(int size) {
        super(size);  // this will call CustomStack(int size) - the constructor that takes size in argument
    }
    //every other method is useful in dynamic stack that we created in CustomStack
    //only the push will change sdo will override it

    @Override
    public boolean push(int item) {
    //this is how you take care if the stack is full
        if (isFull()){
            //we double the size of array
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            //in the end we do
            data = temp;
        }
        //now we insert the item normally
        return super.push(item);
    }
}
