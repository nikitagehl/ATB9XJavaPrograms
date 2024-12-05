package Nov.ex_06_nov;

public class lab001_constructors {

    public static void main(String[] args) {
        // its a special method
        // that has the same name as like class name.
        // its is used to inialize the values
        // its automatically called when we create a new object.

         lab002_constructor_default DC= new lab002_constructor_default();
        System.out.println(DC.fee_paid);
        System.out.println(DC.name);
        System.out.println(DC.number);

        DC.name= "aditi";

        System.out.println(DC.name);

        lab002_constructor_default obj2 = new lab002_constructor_default();

        obj2.name = "goldi";

        System.out.println(obj2.name);
    }
}
