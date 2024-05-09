package OOPs3.Polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num){
        this.num =num;
    }
//at run time java will decide that this tString() method is overridden and run this one
    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint  ovj = new ObjectPrint(69);
        //even if we Ctrl Click it won't show us the overridden method present in this class
        System.out.println(ovj);
    }
}
