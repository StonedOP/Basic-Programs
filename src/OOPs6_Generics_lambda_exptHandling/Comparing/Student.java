package OOPs6_Generics_lambda_exptHandling.Comparing;
//to compare the objects of this class we have to implement Comparable
//this comparable is an interface, and it also has generic type
public class Student implements Comparable<Student>{
    int roll ;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "("+ roll + ", " + marks +")";
    }

    //when we run the if() condition this compareTo method will be called
    @Override
    public int compareTo(Student o) {
//now here I will provide which one I want to compare
        int diff =(int)(this.marks - o.marks);

        //if diff == 0  that means both are equal
        //if diff < 0   that means o is bigger else o is smaller

        return diff;
    }

/*
     so if we use only marks in return type of compareTo method then
                                                         it will only sort marks
     and if we use only roll numbers in return type of compareTo method then
                                                         it will only sort roll numbers of students
*/

}
