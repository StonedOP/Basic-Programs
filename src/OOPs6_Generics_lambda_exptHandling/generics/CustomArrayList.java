package OOPs6_Generics_lambda_exptHandling.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
//first of all we create an array that is private to store the data coz we don't others to access it directly
        private int[] data;
    //we provide a pre size so its static coz no matter what obj we will create initially its maxCapacity will be 10
        private static int DEFAULT_SIZE = 10;
        private int size = 0; // it is working as index value

    public CustomArrayList() {
        this.data = new int [DEFAULT_SIZE];
    }
    //lets make an add function first
    public void add(int num){
//in arrayList if the size is full then the size gets doubled
        if (isFull()){
            resize();
        }
//        data[size] = num;
//        size++;
        data[size++] = num;

    }

    private void resize() {
        int [] temp = new int [data.length * 2];
        // now we copy the items of data into temp
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    //here we create a remove function that returns the last value that is removed
    //


    //                                     let's check next time if we can use size in other way here

    //
    public int removeLast(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set (int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
// as we can see using this is giving us some warning in Yellow colour
        ArrayList list = new ArrayList();

        CustomArrayList list1 = new CustomArrayList();
        list1.add(4);
        list1.add(3);
        list1.add(6);
        list1.add(5);
        System.out.println(list1);

        CustomArrayList list2 = new CustomArrayList();
        for (int i = 0; i < 14; i++) {
            list2.add(i*4);
        }
        System.out.println(list2);

// there is a problem in our CustomArrayList and that is that we can only add integers in it
// but in the internal ArrayList we can store any data type like int,boolean,string etc.
        ArrayList<Integer> InternalList = new ArrayList<>();
        // so here this {<Integer>} will make sure we can add only integers in it
        //InternalList.add("abc") and if we try to add something else to it will give error
    //      this is called generics
        // they help us in providing a parametrised type to the particular instance of class
        // i.e. that class will have particular type of objects
// one reason to use generics
        // if we don't specify the type i.e. ArrayList list = new ArrayList();
        //in this type anyone can add any data type in this list it will allow it
        // so another reason to use generics
//also we can not write primitives in it i.e.
//                        ArrayList<int> list = new ArrayList<>(); this will give error
//so, we can only add classes here

    }
}
