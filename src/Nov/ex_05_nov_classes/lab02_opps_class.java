package Nov.ex_05_nov_classes;

public class lab02_opps_class {
    public static void main(String[] args) {
        Students s1= new Students();
        s1.name= "adi";
        s1.roll_no= 101;
        s1.grade();
        System.out.println(s1.roll_no);
        System.out.println(s1.name);

        int percent= s1.calculate_percent(89,67);
        System.out.println(percent);
    }
}
