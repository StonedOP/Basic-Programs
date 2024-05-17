package OOPs6_Generics_lambda_exptHandling.Comparing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student naman = new Student(30, 81.5f);
        Student kunal = new Student(90, 10.5f);

       /* this not the conventional way to do this
       if(naman < kunal){           it will give error
            System.out.println("naman has more marks than rahul");
        }
*/
        //so now right way to compare is
//this condition will return some value and we can check it by CTRL Click

            if(naman.compareTo(kunal) < 0){
                //if diff == 0  that means both are equal
                //if diff < 0   that means o is bigger else o is smaller
                System.out.println("kunal has more marks than naman");

            }else {
                System.out.println("naman has more marks than rahul");
            }

            // we create some more objects and add them in an array to compare
        Student sakshi = new Student(3, 100.5f);
        Student mehak = new Student(40, 39.5f);
        Student maansi = new Student(40, 60.5f);
        Student mansa = new Student(9, 50.5f);

        Student[] list = {mansa, maansi, mehak, sakshi};

        System.out.println(Arrays.toString(list));


        //Arrays.sort(list);
                    //we can also directly add this comparator in sort method

     /*   Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.roll - o2.roll);
*//*  if we add - then it will get sorted in descending order
                return -(int)(o1.roll - o2.roll);                   *//*
            }
        });
                        */
                    //we can replace this by lambda expression
        Arrays.sort(list, (o1,o2) -> (int)(o1.roll - o2.roll));

        System.out.println(Arrays.toString(list));
        //because we have created the compareTo method in the Student class these values can be compared
        //by default  compareTo method checks the zeroth index values

        // so if we use only marks in return type of compareTo method then
    //                                                     it will only sort marks
        // and if we use only roll numbers in return type of compareTo method then
        //                                                     it will only sort roll numbers of students

        //if we hid the CompareTo method in the class this will give error
    }
}
