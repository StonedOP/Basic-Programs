package OOPs3.Inheritance;
//it will not be able to access the members of parent class that r declared as private
//if we make double l as private, then we won't be able to access it in sout(); directly

public class Main {
    public static void main(String[] args) {

        Box box = new Box();
//        System.out.println(box.l + " " + box.h + " " + box.w);
        Box box1 = new Box(3);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        Box box2 = new Box(23.4, 6.8 ,3);
//        System.out.println(box2.l + " " + box2.h + " " + box2.w);
        Box box3 = new Box(box2);
//        System.out.println(box.l + " " + box.h + " " + box.w);

                        //****
    // here we create boxFUN reference type of Box
        //but here  we create obj type of BoxWeight
        Box boxFUN = new BoxWeight(43,5,6.6,8);
        //System.out.println(weight);   line 14,15 of INFO file
    //this is reference type of box, and it's referencing to an obj of type BoxWeight

/*
        there are many variables in both parent and child class
        we are given access to the var that are in ref type i.e. BoxWeight
        hence , we should have access to weight var
        this also means the ones we are trying to access should be initialised
        but here , when the obj itself is of parent class how can we call the constructor of child class
        i.e below classes know what are above but above classes have no idea what are below
so this will give error
        BoxWeight box4 = new Box(2,3,4);
    hence we can't have child reference variable and a parent object
*/

        BoxPrice box6 = new BoxPrice();
        //this will first super will call the  constructor just above it which is BoxWeight class
        //and super in BoxWeight will call the constructor of Box class
        BoxPrice box7 = new BoxPrice(1,3,6);

                    //static
    //    box7.greeting(); this will also work as the static doesn't depend on object
        //so convention is to call the static method by Class name
        Box.greeting();

        Box box8 = new BoxWeight(); //BoxWeight line6
//because the reference variable is of parent class the object can access its child class
//this will work coz we are calling static method, by convention we should use the class name.
        box8.greeting(); //Box.greeting as the greeting method is declared in Box class LINE8
        BoxWeight.greeting();//it can also be called by child class because of inheritance

        System.out.println(box1.getL());
    }
}
