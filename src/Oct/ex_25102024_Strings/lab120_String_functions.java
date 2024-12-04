package Oct.ex_25102024_Strings;

public class lab120_String_functions {
    public static void main(String[] args) {
        String name= "nikita";

        String s2= new String("nikita");


        /// some of the string functions are

      int size=  name.length(); // to cacluclate the number of characters in a string
        System.out.println(size);

        System.out.println(name.charAt(3)); // find the character at particular index start form 0

        System.out.println(name.concat("gehlod"));
        System.out.println(name);

        System.out.println(name.equals(s2.toUpperCase()));

        System.out.println(name.equalsIgnoreCase(s2.toUpperCase())); //

    }
}
