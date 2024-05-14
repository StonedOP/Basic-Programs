package OOPs4;

public class SubClass extends A{


//here we created a constructor for sub class
    public SubClass(int num , int pro , String name){
        super(num,pro,name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(23,74,"naman");
// here I am able to access the protected member in the same package of subClass
        int f = obj.pro;

        //check OOPs4Encapsulation..../objDemo_info
        System.out.println(obj instanceof A);
        System.out.println(obj instanceof SubClass);
        System.out.println(obj instanceof Object);
    }
}
