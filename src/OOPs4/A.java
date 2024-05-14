package OOPs4;

public class A {
    //so here we create this as private
//                  AND we don't specify anything then that is called default i.e. int num;
    private int num;

    protected int pro;
    String name;
    int[] arr;
//as in encapsulation we use getters and setters to access the private stuff, so here we create them

    public int getNum(){
        return num ;
    }

    public int getPro() {
        return pro;
    }

    public void setNum(int value){
        this.num = value;
    }

    public A(int num, int pro, String name) {
        this.num = num;
        this.pro = pro;
        this.name = name;
        this.arr = new int[num];
    }
}
