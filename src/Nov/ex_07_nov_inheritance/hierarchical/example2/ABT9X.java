package Nov.ex_07_nov_inheritance.hierarchical.example2;

public class ABT9X {



    String student_name;
    String batch;
    boolean is_fees_paid;

    ABT9X(String student_name, String batch, boolean is_fees_paid) {
        this.student_name = student_name;
        this.batch = batch;
        this.is_fees_paid = is_fees_paid;

        System.out.println("ATB9X CONSTARUTOR");
    }

    void Student_details(){


        System.out.printf("Students name is %s and batch is %s and he has already pain fee",this.student_name,this.batch,this.is_fees_paid);
    }
}
