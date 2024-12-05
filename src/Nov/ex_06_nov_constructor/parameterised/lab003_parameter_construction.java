package Nov.ex_06_nov_constructor.parameterised;

import java.util.Scanner;

public class lab003_parameter_construction {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        cars naino= new cars("naino","xyz", 50,100000);
        System.out.println(naino.mileage);

        naino.display();


        // create another object with tesla name

        cars c2 = new cars("tesla","ABCD",40,450000);
        System.out.println(c2.name);
        c2.display();
        System.out.println();
        System.out.println(c2.price);



        // object 3
        System.out.println("enter the car details - name , car engine and car price");
        String cName= sc.next();
        String cEngine= sc.next();
        int cPrice= sc.nextInt();

        cars c3= new cars(cName,cEngine,45,cPrice);


        c3.display();

        sc.close();
    }

}
