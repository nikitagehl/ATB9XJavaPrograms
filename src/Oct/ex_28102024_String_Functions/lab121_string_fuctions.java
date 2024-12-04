package Oct.ex_28102024_String_Functions;

import java.sql.SQLOutput;

public class lab121_string_fuctions {

    public static void main(String[] args) {
        String s1= "my name is nikita   ";

        /// I want a specific part of this string

        System.out.println(s1.substring(5,9)); // last index-1


        // to remove leading and trelling spaces use trim.

        System.out.println(s1.trim()) ;

//        System.out.println(s1.split(" "));



    }
}
