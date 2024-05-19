package OOPs6_Generics_lambda_exptHandling.Exception_Handling;
//here try means execute this block of code and if an exception arise then catch that exception
//the finally block executes on matter what if there is exception or not
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            //int c = a/b;
//IF we use divide func than it will give error if we haven't handled the exception with in the method
            diVide(a,b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this will execute always");
        }
    }
//to handle exception in this method 1st thing is we have to declare it in the method i.e. throws (type of exception)
    static int diVide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("exception handled inside the method ");
        }
        return a/b;
    }

}
