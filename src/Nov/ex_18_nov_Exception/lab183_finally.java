package Nov.ex_18_nov_Exception;

public class lab183_finally {
    public static void main(String[] args) {
        int a=10;
        int c= 0;
        try {
            c = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Always run this");
        }
        System.out.println(c);
    }
}
