package Oct.ex11102024_operators;

public class Logical_operator {
    public static void main(String[] args) {
        // logical operators are perform AND, OR, NOT operations on boolean values.

        // AND - && this symbol is used to perform logical and operation

        int is_valid_date= 27;
        int my_birthdate= 27;
        boolean result= (is_valid_date>0 && (is_valid_date==my_birthdate));
        System.out.println("my birthday is on 27 ? "+result);


        // OR - || is used to perform logical OR operation - if both the condions are true than only the result will true.
        int age_of_my=24;
        int age_of_aditi= 26;

//        lets check the valid marraige age - if the 1st is false than only it check the second one.
        System.out.println((age_of_aditi<18)||age_of_aditi>age_of_my);

//        Not operator - ! this symbol is used to perform not opertaor- it convert the true to false and falsse to true.

        System.out.println(!(age_of_my!=age_of_aditi));

    }
}
