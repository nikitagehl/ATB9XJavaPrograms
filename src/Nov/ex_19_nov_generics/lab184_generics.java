package Nov.ex_19_nov_generics;

public class lab184_generics {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        temp_sum(a, b);
        temp_sum("nik","gehlod");

        // here T can be any refrence name. and is always replicate the data type.
    }


    public  static <T> T temp_sum(T a, T b) {
        System.out.println(a);
        return null;
    }
}
