package OOPs2.Singleton;

public class Main {
    public static void main(String[] args) {
    //    SingleTon obj = new SingleTon(); this will give error that the constructor is private
        SingleTon obj = SingleTon.getInstance();
        // here we are accessing the method by class name, so we make such methods static
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        // ALL 3 reference var r pointing to same one obj
    }
}
