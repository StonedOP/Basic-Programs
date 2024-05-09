package OOPs3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        /*
        here if we create the reference type as well as the object of child class
then even if we remove the area method from parent class it will run then method of child class
         */
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
// if we create the obj of type square but the reference variable is of type parent class
        //then the area method must be present in both parent and child class to be overridden
        Shapes referenceParent = new Triangle();
        referenceParent.area();
    // this will be able to access the function of Triangle Class
        shapes.area();
        circle.area();

    }
}
