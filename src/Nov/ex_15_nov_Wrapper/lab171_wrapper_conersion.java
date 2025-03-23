package Nov.ex_15_nov_Wrapper;

public class lab171_wrapper_conersion {
    public static void main(String[] args) {
        String a="10";
        // convert this string to int

        int a1= Integer.parseInt(a);// directly string to primitive conversion

        Integer a2=  Integer.valueOf(a);// conversion from string to wrapper, wrapper to primitive.
        int a3= a2;


        Long l1= 20l;
        Boolean b= true;
        Short s1= 19;

    }
}
