package OOPs6_Generics_lambda_exptHandling.LambdaFunctions;

import java.util.ArrayList;
import java.util.function.Consumer;

//lambada functions are in line functions ,so if we have a code in single line than we can replace it using it
//and most of the time we don't need the name of the function
public class Lambda_Functions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
                    // when we want to use single parameters
        list.forEach((item) -> System.out.println( item * 3));
        // here (item) is containing parameters and line after (->) is containing body of function
//if we want to use Consumer type we can store the function in it, Ctrl Click to check what this Contains
        Consumer<Integer> fun = (item) -> System.out.println(item * 4);
        list.forEach(fun);

                    // to use multiple parameters we have to create interface

        // here we create operation that take two arguments
        Operation sum = (a,b) -> a + b;
        Operation pro = (a,b) -> a * b;
        Operation sub = (a,b) -> a - b;

        //now to use these operations we create object of that class
        Lambda_Functions myCalculator = new Lambda_Functions();

        System.out.println(myCalculator.operate(3,8, pro));
        System.out.println(myCalculator.operate(3,8, sum));
        System.out.println(myCalculator.operate(3,8, sub));
        /*
        here what's happening is  above will call operate,
operate is taking operation as operation type dot operation(a,b)
    so it will go to the operation(a,b) in Operation interface and form there it will go to the function body
i.e. Operation.sum, pro, sub contains the function's body
        */

    }

    //now we create a function to use the lambda expression , taking argument as
    //also used to call Operation Interface that interns calls the lambda expressions
    private int operate (int a , int b, Operation op){
        return op.operation(a,b);
        // when we will call this operate function with the operation we want to execute that we created in lambda fun
        //it will go to the Interface and check we can use a function taking 2 parameters
        //then it will jump the Operations created in Main class using lambda expressions

    }
}

//here we are storing the function in Operation ike stored in Consumer
interface Operation{
    //creating a function that takes two arguments
    int operation(int a, int b);
}