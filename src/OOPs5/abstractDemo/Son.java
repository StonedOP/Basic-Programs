package OOPs5.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
//        this.age = age;
    }

    @Override
    public void carrier() {
        System.out.println("I want to be coder");
    }

    @Override
    public void partner() {
        System.out.println("I love my love");
    }
}
