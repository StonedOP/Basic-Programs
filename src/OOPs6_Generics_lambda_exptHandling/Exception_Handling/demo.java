package OOPs6_Generics_lambda_exptHandling.Exception_Handling;

public class demo{
    public static void main(String[] args) {
        //Main.diVide(3,0); //  commented to make line12 run
        //this will also display the exception we created
        try {
            //   Main.diVide(6,0);
//if put the Exception block here than it will cause error that we have already caught the exception

            //and if the Arithmetic exception is not there lets say a random exception
//           throw new Exception("to check which block of code will run");

            //to use our created my exception class
            String name = "NAMAN";
            if(name.equals("NAMAN")){
                throw new MyException("name is naman");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        //so why are you catching it again
    //so more strict exceptions should be added first
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        catch (Exception e){ // if we want to catch some strict exceptions we should add this block after that
            System.out.println("Exception that includes everything & will catch all the sub exception");
        }
    }
}
