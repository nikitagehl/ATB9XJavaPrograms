package Nov.ex_15_nov_Wrapper;

public class lab177_handled_arithmatic {
    public static void main(String[] args) {
        int a=0;
        int b= 0;
        try {
            b = 100/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
