package Nov.ex_07_nov_inheritance.hierarchical.example2;

public class automation extends ABT9X {



    automation(String student_name, String batch, boolean is_fees_paid) {
        super(student_name,batch,is_fees_paid);
        this.student_name = student_name;
        this.batch = batch;
        this.is_fees_paid = is_fees_paid;

        System.out.println("automation constructor");
    }
    void java(){
        System.out.println(" you are the students of java");
    }

    void Student_details(){
        System.out.println(" we have 4 courses- java, selenium, API, appium");

        System.out.printf("Students name is %s and batch is %s and he has already pain fee",this.student_name,this.batch,this.is_fees_paid);
    }






}
