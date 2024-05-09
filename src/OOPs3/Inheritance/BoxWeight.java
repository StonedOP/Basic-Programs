package OOPs3.Inheritance;

public class BoxWeight extends Box{
    double weight ;

    // here this won't work POLYMORPHISM info LINE 29 and Main line46 Box box8 = new BoxWeight();
//    @Override
//    static void greeting(){
//        System.out.println("hey, I am in BoxWeight. Greetings!");
//    }
    public BoxWeight(){
        this.weight = -1;
//it will not be able to access the members of parent class that r declared as private
        //if we make double l as private then we won't be able to access it
        //this.l = -1; this won't work
    }

    // now if we want BoxWeight class to be able to use the var and constructors of Box Class
    //to create an obj of BoxWeight with the parameters l,w,h of Box class we extend its const by super key word

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);//this keyword will call the parent class constructor
        //used to initialise values present in parent class
        //here l can be initialised coz to initialise here constructor of box class is being called
    //we can confirm that by pressing (ctrl Click)
        this.weight = weight;
    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    //this is a copy constructor
    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
}
