package Nov.ex_18_nov_Exception;

public class lab180_okok_coder {
    public static void main(String[] args) {
        int a=10;
        int c= 0;
        try {
            c = a/0;
        } catch (Exception e) { // ok ok coder can use Exeption class in catch block
            System.out.println(e.getMessage());
        }
        System.out.println(c);
    }
}
