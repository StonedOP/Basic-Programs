package OOPs5.Interfaces.extendDemo;

public class C implements B{
//so if we are implementing only B in Class C & B extends interface A then we can use the abstract methods in A as well
    @Override
    public void fun() {
        System.out.println("fun is running");
    }

    @Override
    public void greet() {
        System.out.println("we can use greeting in Class C as well.");
    }
}
