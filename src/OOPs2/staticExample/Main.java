package OOPs2.staticExample;
//and we don't have to import it because it is in the same package
//a property that is common to all the human like POPULATION

// so such properties that are not directly related to objects those are know as static variables or methods

public class Main {
    public static void main(String[] args) {
        Human naman = new Human(23, "Naman", 1000, false );
        Human abcd = new Human(3, "pqr", 9000, true );
/*
            // here if we don't declare population as static and call it
        System.out.println(naman.population);
        System.out.println(abcd.population);
            //this will return 1 in both cases
*/
        //BUT if we make the var static
    //    System.out.println(naman.population); both will work but convention is to
    //    System.out.println(abcd.population);  call static var by class name

        System.out.println(Human.population);
        System.out.println(naman.name);

        //if we call a non-static method in static method it will not run
        //coz not static method will have an instance but static wil not
        //greeting();               this will give error
        //so if u don't have an instance u can not use non-static method in static

        Main funn = new Main();
        funn.fun2();
    }
    static void fun(){
       //greeting();  // we can't use it coz it requires an instance
        //& the function we are using it in does not depend on instances

    // u can't access nonstatic stuff without referencing their instances in static context
        Main obj = new Main();
        obj.greeting();
    }
                    //IN THE END ALL THE THING THAT WE WRITE WILL BE CALLED IN A STATIC METHOD
    //so an obj will be created when non-static or a static method is called
    void fun2 (){
        greeting();
    }
    void greeting(){  // we know something that is not static, belongs to an obj
//        fun(); // this will work fine i.e. is static can be accessed in non-static
        System.out.println("hello i m obj dependent method");
    }
}
