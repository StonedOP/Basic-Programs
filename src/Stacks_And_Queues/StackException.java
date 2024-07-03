package Stacks_And_Queues;
//we create our own exception class
public class StackException extends Exception{
    public StackException(String message) {
        //here we call the parent class
        super(message);
    }
}
