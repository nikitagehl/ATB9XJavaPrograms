package Nov.ex_06_nov.Constructor_overloading;

public class lab004_overloading {

    public static void main(String[] args) {
        students s1= new students("nikita",200,"pipliya");
        s1.display_details();


        students s2= new students(10,true);
        s2.display_details();


        students s3= new students();
        s3.display_details();
    }
}
