package OOPs2.Singleton;
//a class where only one object is allowed to be created
public class SingleTon {
// to be a singleton class it should not be allowed to call its constructor

    //private int num = 0;
    private SingleTon(){

    }
    // coz we need only one instance so lets create an instance

    // since this instance is not going to be dependent on the obj of this class  we can make it static
    private static SingleTon instance;

    // we create a fun of public type that will return a SingleTon type of Instance;
    //we will be accessing the method by class name, so we make such methods static
    public static SingleTon getInstance() {
        //this function will check if there is an instance already or not & if not then create an instance
        // here we can call the private constructor coz it's in the same class
        if(instance == null){
            instance = new SingleTon();
        }
        return instance;
    }


}
