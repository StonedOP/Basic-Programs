package OOPs5.Interfaces.extendDemo2;

public interface B {
    void greet();

//this will give error if we create a default method in a package with same name
//    default void fun(){
//        System.out.println("i am in interface A");
//    }

    static void greeting(){
        System.out.println("i am static greeting method in B Interface ");
    }
}
