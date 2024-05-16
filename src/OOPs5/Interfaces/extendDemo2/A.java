package OOPs5.Interfaces.extendDemo2;

public interface A {


    default void fun(){
        System.out.println("i am in interface A");
    }

//they also need to have body like above
    // can be called by using interface name its crated in
    static void greeting(){
        System.out.println("i am static greeting method in A Interface ");
    }
}
