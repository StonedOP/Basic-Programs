package OOPs5.abstractDemo;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(34);
        son.carrier();
        son.normal();

        Daughter daughter = new Daughter(5) ;
        daughter.carrier();

      //  Parent mom = new Parent(); this will give error

        Parent.hello();

    }

}
