package OOPs5.abstractDemo;

public abstract class Parent {
    int age;
    final int value ;

    //we can create a constructor in abstract class to get called in child classes by super keyword
    Parent(int age){
        this.age = age;
        value = 1919191;
    }

    static void hello(){
        System.out.println("hey, its a static method in abstract class");
    }
    void normal(){
        System.out.println("this is a noemal method");
    }
    public abstract void carrier();
    public abstract void partner();
}
