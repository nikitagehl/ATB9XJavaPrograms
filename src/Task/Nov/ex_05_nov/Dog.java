package Task.Nov.ex_05_nov;

public class Dog {

    String name;
    String food;
    int age;


    void sleep(){
        System.out.println("I am sleeping now....");
    }

    String eat(String food){
        System.out.println("my food is"+food);
        return food;

    }
}
