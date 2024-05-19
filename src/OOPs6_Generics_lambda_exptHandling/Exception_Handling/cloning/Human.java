package OOPs6_Generics_lambda_exptHandling.Exception_Handling.cloning;
//so to create the clone of an object the lang package of java provide interface called cloneable
public class Human implements Cloneable{
    int age ;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,4,6,7};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
    }
                                        //shallow copy
//here we are overriding the method in the object class  and we can check by typing @override
    @Override
    public Object clone () throws CloneNotSupportedException{
// here this method throws an exception i.e. where its declared , so it will give error if we not
// throw exception with the method declaration

//for non-primitive this crated new copy but for primitives the reference variable points to same object
        //this is shallow copy i.e. when we changed the primitive of cloned array it changed the original too
        return super.clone();
    }

    public Object deepCopy() throws CloneNotSupportedException{

        Human human = (Human) super.clone(); // this is the shallow copy
        //this is the deep copy
        human.arr = new int[human.arr.length];
        for (int i = 0; i < human.arr.length; i++) {
            human.arr[i] = this.arr[i];
        }
        return human;
    }
}

