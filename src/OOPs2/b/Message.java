package OOPs2.b;

public class Message {
    public static void main(String[] args) {

    }
    //if we make this method private it won't be accessible in outside package OOPs.a
    public static void message(){//I will call this message in package (OOPs.a -> greeting class)
        System.out.println("java will import this package to the file where this message is called");
    }
}
