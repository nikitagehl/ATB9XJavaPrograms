package Nov.ex_18_nov_Exception;

public class lab179_try_catch_handle {
    public static void main(String[] args) {
        int a=10;
        int c= 0;
        try {
            c = a/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
