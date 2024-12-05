package Nov.ex_06_nov_constructor.parameterised;

public class cars {

    String name;
    String engine;
    int mileage;
    long price;

    // parametrised constructor

    cars(String car_name,String car_engine,int car_mileage, long car_price){
        this.name= car_name;
        this.engine= car_engine;
        this.mileage= car_mileage;
        this.price= car_price;



    }

    void display(){
        System.out.println(this.engine);
        System.out.printf("this car name is %s and its mileage is %d", this.name, this.mileage);
    }
}
