package OOPs6_Generics_lambda_exptHandling.Exception_Handling.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Human naman = new Human(23, "Naman Sharma");
        Human clone = new Human(naman);
        //the problem is that its taking alot of time coz its using new keyword
    // so to create the clone of an object the lang package of java provide interface called cloneable

        // now there are 2 things here
//1 that the method returns the Object type so we have to type cast it as Human object
//2 coz it throws an exception so we have to mention it here too


        Human twin = (Human)naman.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0] = 100;
    // here we change the cloned object twin and it changed the original object as well coz of shallow copy
        System.out.println(Arrays.toString(naman.arr));


        // deep copy
        Human sakshi = new Human(22 , "Sakshi");
        Human clOne = (Human) sakshi.deepCopy();
        System.out.println(sakshi.age);
        System.out.println(Arrays.toString(sakshi.arr));
        clOne.arr[0] = 69;
        System.out.println(Arrays.toString(clOne.arr));
        System.out.println(Arrays.toString(sakshi.arr));
    }

}
