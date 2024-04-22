package OOPs2.staticExample;
// demo to show initialisation of static variables
public class StaticInitialisation {
    static int a = 4;
    static int b;

// will only run once. when the first obj is created i.e. when the class is loaded foe the first time
    static {
        System.out.println("i am in a static block i.e. only run once the class is loaded");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInitialisation obj = new StaticInitialisation();
        System.out.println( StaticInitialisation.a + " " + StaticInitialisation.b);

        StaticInitialisation.b += 3;
        System.out.println(StaticInitialisation.b);

        StaticInitialisation obj2 = new StaticInitialisation();
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);
    }

}
