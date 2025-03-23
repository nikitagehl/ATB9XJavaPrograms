package Nov.ex_15_nov_Wrapper;

public class lab175_nullpointer {
    public static void main(String[] args) {

        System.out.println("start of program");
        String s1= null;
        s1.trim();// nullPointerException
        System.out.println(s1);
        System.out.println("end of program");
    }
}
