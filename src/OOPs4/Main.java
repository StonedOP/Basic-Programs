package OOPs4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A obj = new A(3, 8,"naman");
        //now we need to access and modify the data members
        //but, it is not a good convention to let the data get accessed directly
        //EG
        ArrayList<Integer> list = new ArrayList<>(23);
        //when we create an obj of this ArrayList class it has some initial capacity which is made private
        //so, we can't access it directly
    //  list.DEFAULT_CAPACITY;
        //So if we need to change it, we are provided a constructor that takes the value

        System.out.println(obj.getNum());
        //int k = obj.num; this will give error cause its protected
        System.out.println(obj.getPro());
        int f = obj.pro;
    }
}
