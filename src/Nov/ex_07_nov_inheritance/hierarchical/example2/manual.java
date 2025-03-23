package Nov.ex_07_nov_inheritance.hierarchical.example2;


import java.sql.SQLOutput;

public class manual extends ABT9X {

    manual(String student_name, String batch, boolean is_fees_paid) {
        super(student_name,batch,is_fees_paid);
        this.student_name = student_name;
        this.batch = batch;
        this.is_fees_paid = is_fees_paid;

        System.out.println("manual cosntructor ");
    }
}
