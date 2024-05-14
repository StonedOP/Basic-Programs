package OOPs4ENCAPTULATION_Different_packageTEST;

import OOPs4.A;

public class NotSubClass{

// here in line18, I am able to access the protected member in the subClass of DIFFERENT PACKAGE
    //directly without using the method



    //here we created a constructor for subClass


    public static void main(String[] args) {
        NotSubClass obj = new NotSubClass();
        // this tis will give error
    //  System.out.println(obj.getNum());
    //  int f = obj.pro;
    }
}
