package OOPs;

public class classes_obj_constructor {
    public static void main(String[] args) {

//        int[] rol = new int[5];
//        String[] names = new String[5];
//        float[] marks = new float[5];
        //if we want to create our own data type we use classes
//lke here we can create a Student class
        Student student1 = new Student(12, "Naman", 99.9f);
        Student random = new Student(student1);
        System.out.println(random.names);
        student1.greeting();
        student1.changeName("abcde");
        student1.greeting();
        //random.changeName("xyz");
        System.out.println(random.names);
        random.greeting();
        Student pqr = new Student();
        System.out.println(pqr.names);

        Student one = new Student();
        Student two = one;
        one.names = "something something";
        System.out.println("name of two changed coz both r pointing to same obj -name of two=" + two.names);
        //            ABOUT FINAL
        //    int a= 10;
        //    int b = 20;
        //    swap(a,b);

    /*this will not work these ar primitives in java every this is passed by value
         so here pointer to won't be passed just the value will be passed
         ths a in swap is inside that fun only so it will swap it inside that function only
        */
        /*
but when we pass obj reference value is passed
        Integer a = 10;
        Integer b = 20;
        swap(a , b);
                it still won't swap
            THE REASON IS THAT Integer is a FINAL CLASS & we can check by pressing Control Click

        so final is keyword by which we can prevent content to be modified or make it constant
    amd coz we can't modify it, so we always have to initialise it
    class A {
        final int num; this will give error as it's not modified
    }
         */
        /*
        it works only when the instance var are primitive data types
        if the instance var of a reference type final modifier it will refer to the same obj but
        the value of the obj can change
         */

        final A naman = new A("naman Sharma");
    //so i can change the value here
        naman.name= "other name";
        //so when a non primitive is final, you can't reassign it
 //this will error    naman = new A("new obj");
        /*
                    GARBAGE COLLECTOR
        we can't destroy the object manually but we can tell java what to do when obj is destroyed
        1       BY FINALIZE METHOD

        A obj;
        for (int i = 0; i < 100000; i++) {
            obj = new A("random name");
// this will not work for low value of i
        also need to check why finalize was not working
        }
        */
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

    class A {
        final int num =10;
        String name;
        public A(String name){
            this.name = name;
        }

//        @Override
//        public void finalize() throws Throwable {
//            System.out.println("obj destroyed");
//        }
    }

/*
this is how we create classes
    it is named group properties and function
    -> class is just a logical construct
    -> object is physical reality which occupies some space in memory
        if 2 reference variables r pointing to a same object in heap than
        if the change is made by 1 var than it will be visible in the other var
    -> all the var that r inside the object are called instance variables and the var that define the obj
        is called reference variables
    When we write (Student student1;) it means we have declared a reference to object of type Student
                                                and not initialised it yet that will point to null
  So if actually want to create an object we do student1 = new Student();
here the {?student1?} is a reference variable pointing to the object in heap INTERNALLY it might be
holding memory address to that obj in heap
but we can't ACCESS THAT MEMORY ADDRESS COZ IN JAVA ITS NOT ALLOWED SO THIS THE KEY FOR JAVA SAFETY
THAT WE CAN'T MANIPULATE REFERENCES as that acn be done in C++ with pointers
        so we can't make an obj reference to point to an arbitrary memory reference or manipulate it
here new keyword dynamically allocates memory and returns a reference var to it
dynamic memory allocation means allocating memory when the program starts running after compilation
                             Student student1 = new Student();
            this happens at compile time        this happens at run time
compiling means checking for errors             it's when all these checks and conversion are done and code
getting converted to byte code then to          starts running that is when the memory is allocated in RAM
machine code and then to jvm

Student() id a Constructor
it is a special function that runs when you create an obj and it allocate some var

    */

    class Student {
        int rol;
        String names;
        float marks;

        void greeting(){
            System.out.println("hello my name is-" + this.names);
        }
        void changeName(String newName){
            names = newName;
        }
        Student(int roll, String name, float marks) {
         /*
            here we have to put this here because the var in constructor and in class r same so
            f we don't use this java will get confused which var we are specifying i.e. we can't do
            rol = rol;
            names = names;
            marks = marks

           */
            this.rol = roll;
            this.names = name;
            this.marks = marks;
        /*
    this key word means when we r calling Student student1 = new Student(43, Naman, 99.9)
    this. will be replaced with student1 and assign the values that r passed in constructor


        */
        }

        // this is how u can assign the value of declared object to new one
        // by passing the type student in the constructor
        Student(Student other){
            this.names = other.names;
            this.rol =  other.rol;
            this.marks = other.marks;
        }
        // this how u can call other constructor through another constructor
        //we use this with brackets i.e. {<--this(value, value)-->}
        Student(){
            this(99, "default person", 100f);
        }
    }

