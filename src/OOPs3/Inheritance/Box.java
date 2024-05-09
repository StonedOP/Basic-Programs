package OOPs3.Inheritance;

public class Box {
    private double l;
    double w;
    double h;

    static void greeting(){
        System.out.println("hey, I am in box. Greetings!");
    }
    public double getL(){
        return l;
    }
    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    //cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.l = side;
    }

    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    //coppy contructor
     Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
     }

    public void information(){
        System.out.println("box is running");
    }
}
