package OOPs3.Polymorphism;

public class Square extends Shapes{
    //this will run when the obj of child class is created
    //hence it is overriding the parent method
    @Override //this is an annotation and these can be created using Interfaces
    //i.e. if we want to check if the method is overridden or not
    void area(){
        System.out.println("Square area is = side * side");
    }

    /* this will give error in @override because area2() method is not overridden
    @Override
    void area2(){
        System.out.println("Square area is = side * side");
    }
     */
}
