package OOPs6_Generics_lambda_exptHandling.Comparing;
// here we implement the GenericInterface<T> we created , we have to  provide with the type <T>as well
//so lets say we provide the generic as Integer type
public class usingGenericInterface implements GenericInterface<Integer>{

    //here we have implemented the method and java has automatically created the function taking Integer
    // that <T> in GenericInterface was replaced with the type that we provided above
    @Override
    public void display(Integer value) {

    }
}
