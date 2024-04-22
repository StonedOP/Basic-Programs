package OOPs2.staticExample;
//I will use this class in main of staticExample
//a property that is common to all the human like POPULATION

// so such properties that are not directly related to objects those are know as static variables or methods

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    /*
    so such properties that are not related to obj but common to all objects of that class
     are declared as static
     long population;
    */
    static long population;


    static void messge(){
        System.out.println("hello u cant use this keyword here coz i'm a static method");

       // System.out.println(this.age); // cant bw used will give error
        // because static is not dependent obj and this is dependent it won't work

    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        /*
        so now if the static var does not depend on obj i.e. not related to obj
   that is the reason we don't call static var with (this)keyword
         this.population += 1; as here id its called than (this) will be replaced with (naman.population)
         this.population += 1;
         */
            //so to access the static variable we use CLASS NAME
        Human.population += 1;


    }
}
