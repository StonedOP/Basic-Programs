package OOPs5.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine car1 = new Car();
//but it will only be able to access the methods or variables present in Engine
        car.start();
        car.acc();
        car.brake();
        car.stop();

        System.out.println();
        NiceCar car2 = new NiceCar();
        car2.start();
        car2.mediaPlayerStart();

        car2.changeEngine();
        car2.start();
        car2.changeEngine(new PowerEngine());
        car2.start();

    }
}
