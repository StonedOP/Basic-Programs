package OOPs4ENCAPTULATION_Different_packageTEST;

import OOPs4.A;

public class SubClass extends A {

// here in line18, I am able to access the protected member in the subClass of DIFFERENT PACKAGE
    //directly without using the method



    //here we created a constructor for subClass
    public SubClass(int num , int pro , String name){

        super(num,pro,name);
    }

    public static void main(String[] args) {
// only the subClass can access the protected members in base class
// so, here if we create an obj using A class then it will not let us access the protected members
        A obj1 = new OOPs4.SubClass(44, 78, "accessed by base class");
        //    int v = obj1.pro; this will give error

        SubClass obj = new SubClass(23, 74, "naman");
        System.out.println(obj.getNum());
        int f = obj.pro;
    }
}
class SubClass2 extends A{
    //SubClass2 may not have been written by the time we were using SubClass
//lets say if this SubClass2 has some protected members of its own so, it would be very dangerous to let SubClass
    //tamper with the protected members of this SubClass2
    public SubClass2(int num, int pro ,String name) {
        super(num, pro, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(22,67,"SubClass has no idea about SubClass2");
        int h = obj.pro; // we can access protected members
    }
}