package OOPs6_Generics_lambda_exptHandling.generics;

import java.util.Arrays;
import java.util.List;

// we can also restrict this particular type (T) that we provide
//as the Number class has other types Integer,Float etc. so we can use this method of wildcard to do so
//we can extend this (T)as that class we want it take and any other type will throw error

//should either be extended class or its subclass
public class WildcardExample<T extends Number> {
    //now if we pass String while creating an object it will give error
        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0; // this also works as index

    public WildcardExample( ) {

        data = new Object[DEFAULT_SIZE];
    }

    // using of wildcard method in some functions
    //lets say a method that takes a list of Numbers
    public void getList(List<Number> list){
        // body of a function , do something
    // but as we can see when have to pass a list we can only pass Number type
    }

    //but if we want to pass the Number type and its subclasses as well,
    //then we do this
    public void getListSubClasses(List<? extends Number> list){

        // some algorithm or body to be executed

    }


    public void add( T num){
        if ( isFull()){
            resize();
        }
        data[size] = num;
        size++;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
// here we don't need to type cast the variables coz we are add something in bigger type temp i.e. of type Object
            // and the value that we are assigning to temp is of type (T) i.e. data[i]
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length ;
    }

    public T removeLast(){
// but here we have to typecast coz we are returning result of type (T) but the data is of type object
        T removed =(T)(data[size]);
        size--;
        return removed;
    }
    public T get(int index){
        return  (T)(data[index]);
    }
    public int size(){
        return size;
    }

    //here in set also type casting is not required
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample<>();
        //now if we pass String while creating an object it will give error
   //     WildcardExample<String> list3 = new WildcardExample<>();  this will give error

//we can also add Number itself ,so we can pass  the extended class or its subclasses
        WildcardExample<Number> list2 = new WildcardExample<>();

        for (int i = 0; i < 15; i++) {
            list.add(i*7);
        }
        //here this will call the overridden toString() method
        System.out.println(list);
    }
}



