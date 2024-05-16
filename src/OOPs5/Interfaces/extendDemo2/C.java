package OOPs5.Interfaces.extendDemo2;

public class C implements A,B{
// sop here coz fun() method is default in A so can leave it and only Override the greet() method on B
    @Override
    public void greet() {
    }


    public static void main(String[] args) {
        A.greeting();
    }
}
