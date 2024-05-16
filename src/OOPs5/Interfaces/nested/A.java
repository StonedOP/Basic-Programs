package OOPs5.Interfaces.nested;

public class A {
    //nested interface
// the only difference between nested interface and top level interface is
// nested interface can be public,private,protected
    // but top level have to declared as public or default
    public interface NestedInterface{
        boolean isOdd(int num);
    }

}
class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
