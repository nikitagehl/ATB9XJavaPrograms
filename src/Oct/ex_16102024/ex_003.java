package Oct.ex_16102024;

import java.util.Scanner;

public class ex_003 {
    public static void main(String[] args) {
        // lets take float value from user

        Scanner sc= new Scanner(System.in);
        System.out.println(" enter your overall marks");
        float f= sc.nextFloat();
        if(f>0 && f<=500){
        float percent = f/5;
            System.out.println(" your percent of 5 subject is "+percent);
        }
        else {
            System.out.println("enter the correct marks ");}
    }
}
