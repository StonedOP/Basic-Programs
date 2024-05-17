package OOPs6_Generics_lambda_exptHandling.Comparing;
//e.g. of Interface with generic type
// here we created our own interface with generic type

public interface GenericInterface<T> {
    //we can create functions
        void display (T value);
}
// and now we have created a generic interface  so that we can use its methods,
//so we have to create a class that implements this interface and  provide body to its methods