package OOPs2.staticExample;
//outside classes can not be static
class Test1{
    static String name;

    public Test1(String name) {
        Test1.name = name;
    }
}
public class InnerClasses {
    //Inner classes can be static
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        /*
                        WHEN THE Test CLASS IS NOT STATIC

        //  here this is not working coz the test class is dependent on outer class named (InnerClasses)
        //  this will say test is dependent on outer class who is your obj & here  test don't have one
        Test a = new Test("this will");
        Test s = new Test("give error");

         */
                // WHEN THE Test CLASS IS STATIC
        //internally other things will automatically be static
        Test a = new Test("naman");
        Test b = new Test("rahul");
// when a class is made static we check where it is mentioned as static
//here this test class is mentioned as static inside InnerClasses
        //hence it is not dependent on the objects of InnerClasses class

//BUT Main & Test can have instances of each other
        System.out.println(a.name);
        System.out.println(b.name);


    // THIS WILL WORK coz this Test1 class doesn't depend on any other class
        Test1 c = new Test1("First declaration");
        Test1 d = new Test1("Second declaration");
        //the name variable is static, and we have updated the static var twice so below will display second
        System.out.println(c.name);
        System.out.println(d.name);


        System.out.println(a);
    }
}
/* will give error
so outside classes can not be static coz
it itself is not dependent on any other class
static class A{

}

 */