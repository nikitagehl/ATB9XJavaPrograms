package Nov.ex_18_nov_Exception;

public class lab181_good_coder {
    public static void main(String[] args) {
        int a=10;
        int c= 0;
        try {
            c = a/0;
        } catch (ArithmeticException e) { // a good coder knows what exception class should I use to handle it.
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
