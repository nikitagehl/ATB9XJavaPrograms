package Task.Nov.ex_05_nov;

public class task_001 {

    public static void main(String[] args) {
        Dog d1 = new Dog(); // object one is created
        d1.name = "taffy";
        d1.age = 12;
        d1.sleep();
        d1.eat("chapatti");

        System.out.println(d1.name);


        // object 2

        Dog d2 = new Dog();
        d2.name = "rossy";
        d2.age = 18;
        d2.eat("fast food");

        System.out.printf("my name is %s and I am %d years old and I eat %s", d2.name, d2.age, d2.eat("fast food"));

// object 3
        Dog d3 = new Dog();
        d3.name = d2.name;
        d3.food = "new food";
        d3.eat(d3.food);

        System.out.printf("my name is %s and I am %d years old and I eat %s", d3.name, d3.age, d3.eat(d3.food));


        // object 4
        Dog d4= new Dog();
        d4.name= "tata";
        d4.food= "royal food";
        d4.age= 10;
        System.out.println(d4.food);
        System.out.println(d4.name);
        System.out.println(d4.age);

        d4.sleep();

    }


}
