package Nov.ex_07_nov_inheritance.singleInheritance.example2;

public class lab001_SI {

    public static void main(String[] args) {
        Students s1= new Students();
        s1.is_fee_paid= true;

        ATBStudents atb= new ATBStudents();
        System.out.println(atb.is_fee_paid);

    }
}
