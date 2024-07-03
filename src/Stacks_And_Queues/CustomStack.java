package Stacks_And_Queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULt_SIZE = 10;

    int ptr = -1;
    public CustomStack() {
//here this keyword will call the constructor that takes int as input and that will be default size here
        this(DEFAULt_SIZE);
    }

    public CustomStack(int size) {

        this.data = new int[size];
    }

//to apply insert and remove operations  we use a ptr variable to keep track of the index this is to be operated
//so this ptr pointer will always point to the last item added
    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
    //so to add the item in stack we increase the pointer
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException {
        if (isEmpty()){
    //we throw an exception if stack is empty
            throw new StackException("Can't pop from empty stack");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        // in simple terms
        return data[ptr --];
    }
    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Can't peek from empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
    //stack is full when the ptr is at last index
        return ptr == data.length -1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
