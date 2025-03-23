package Nov.ex_15_nov_Wrapper;

public class lab176_exception_handled {
    public static void main(String[] args) {
        System.out.println("start of program ");
        String s1= null;
        try {
            s1.trim();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("end of program");
        System.out.println(s1);
    }
}
