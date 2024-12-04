package Oct.ex_25102024_Strings;
import java.lang.String;
public class lab119 {
    public static void main(String args[]){
//        why string is immutable

        String name= "Nikita";

      String s2= name.toUpperCase();
        System.out.println(name);
        System.out.println(s2);

        String s3= new String("aditi");
        s3.toUpperCase();
        System.out.println(s3);
    }
}
