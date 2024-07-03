package Stacks_And_Queues;

public class StackMain {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);
        stack.push(3);
        stack.push(41);
        stack.push(612);
        stack.push(1);
        stack.push(65);
        stack.push(90);
    //here if we add item in custom stack when it is full it will give error
        //but the dynamic stack will solve this problem
    }
}
