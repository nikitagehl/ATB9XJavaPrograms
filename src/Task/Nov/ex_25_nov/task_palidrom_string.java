package Task.Nov.ex_25_nov;

import java.util.Scanner;

public class task_palidrom_string {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string to check is it palindrom or not");
        String s1 = sc.next();
        Boolean resutl= palidrom(s1);
        System.out.println("Is this string is palindrom: "+ resutl);

        sc.close();

    }

   static Boolean palidrom(String s){
        String r= "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c= s.charAt(i);
            r= c+r;
        }
        if(s.equals(r)) {
            return true;
        }
        else
            return false;
    }


}
