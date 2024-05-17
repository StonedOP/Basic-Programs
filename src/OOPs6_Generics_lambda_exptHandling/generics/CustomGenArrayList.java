package OOPs6_Generics_lambda_exptHandling.generics;

import java.util.Arrays;
// we can also restrict this particular type (T) that we provide
//as the Number class has other types Integer,Float etc. so we can use this method of wildcard to do so
//we can extend this (T)as that class we want it take and any other type will throw error
public class CustomGenArrayList<T> {
        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0; // this also works as index

    public CustomGenArrayList( ) {
        data = new Object[DEFAULT_SIZE];
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
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i*7);
        }
        //here this will call the overridden toString() method
        System.out.println(list);
    }
}



