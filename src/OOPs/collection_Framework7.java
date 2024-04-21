package OOPs;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class collection_Framework7 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        list2.add(3);
        list2.add(45);
        list2.add(65);
        list2.add(78);
        System.out.println(list2);

        //               VECTOR is synchronized i.e. only one thread can access it at a time
        //                so because of this vector is slower than arrayList
        // and in arrayList multiple thread can access it
        List<Integer> vector = new Vector<>();
        vector.add(3);
        vector.add(5);
        vector.add(56);
        vector.add(76);
        System.out.println(vector);

        //          enums
        //   so we use nums when want to use fixed group of objects


        enum Week implements Aaa{
            //also we can implement the interface in enums
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
            //these are enums constants
            //public, static and final
            //since they are final we can't create child enums

// also the abstracts ar not allowed in enums
        //  void display(); so this abstract method will give error
            //i.e. a method body is required
            void display(){}

            Week(){
                //its purpose is to print this message when new object is declared, but it will run for all
        //i.e. on accessing one->week = Week.Monday
                System.out.println("constroctor called for " + this);
            }
            //when we call this above constructor and try to access one it will call all
            // this constructor is not public or protected, only private or default
            //because we don't want to create new objects
            // internally its : public static final Week Monday = new Week();


            @Override
            public void hello() {
                System.out.println("hello,enums can not extends classes but can implement interfaces");
            }
        }

        Week week ;
        week = Week.Monday;
        for (Week day : Week.values()){
            System.out.println(day);
        }
        System.out.println(week.ordinal());
        week.hello();

    }
    //interface can only extend interface
    //so, many interfaces like list,queue,deque,set hashset,etc extend collection similar for map


}
