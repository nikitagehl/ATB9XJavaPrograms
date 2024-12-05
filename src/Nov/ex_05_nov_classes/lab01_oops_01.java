package Nov.ex_05_nov_classes;

public class lab01_oops_01 {
     // how to create a class
     public static void main(String[] args) {

         A a1= new A(); //-> here A is class loader  , a1 is name ref. to object and new A(); is object creation.
         a1.name="nikita";
         System.out.println(a1.name);

     }


}

class A{
    // its attributes are -
    String name;
    int age;
}
