package OOPs6_Generics_lambda_exptHandling.Exception_Handling;
//every class that has exception extends the  main Exception class
public class MyException extends Exception{
    public MyException(String message) {
        //we wil call the message that main exception throws
        super(message);
    }
}
