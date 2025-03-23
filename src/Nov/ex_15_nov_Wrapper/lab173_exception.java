package Nov.ex_15_nov_Wrapper;

public class lab173_exception {

    public static void main(String[] args) {
        String s2= args[0]; // what is I not pass any value in arguments, it gives me exception

        int a1= Integer.parseInt(s2);

        int c= 100/a1;
        System.out.println(c);
    }
}
