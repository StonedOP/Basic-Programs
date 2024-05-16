package OOPs5.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
   //     this.age = age;
    }

    @Override
    public void carrier() {
        System.out.println("I want to be House Wife");
    }

    @Override
    public void partner() {
        System.out.println("I love my Naman");
    }
}
