package Nov.ex_06_nov_constructor.Constructor_overloading;

public class students {

    String name;
    int roll_no;
    int fees;
    boolean is_pass;
    String address;



    students(){
        this.name= "acd";
        fees= 12000;
        address= "canada";
        roll_no= 101;
        is_pass= true;
    }

    // same name but diffrent arguments is called overloading

    students(String S_name, int S_fees,String S_addess){
        this.name= S_name;
        this.fees= S_fees;
        this.address= S_addess;

    }

    students(int S_rollNo, boolean pass){
        this.roll_no= S_rollNo;
        this.is_pass= pass;
    }

   void display_details(){
       System.out.println("name of this student is "+ this.name);
       System.out.println(this.is_pass);
       System.out.println(this.roll_no);
       System.out.println("fees is =" + this.fees);
    }
}
