package Task.ex_18_oct;

import java.util.Scanner;

public class print_Month {
    public static void main(String[] args) {
//        Write a program that takes an integer input (1-12) and
//        prints the name of the corresponding month using a switch statement.
//                Input  - 12
//        Out - Dec.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number and we will let you know which month is...");
        byte num= sc.nextByte();
        switch (num){
            case 1-> System.out.println("January");
            case 2-> System.out.println("Feb");
            case 3-> System.out.println("March");
            case 4-> System.out.println("April");
            case 5-> System.out.println("May");
            case 6-> System.out.println("June");
            case 7-> System.out.println("July");
            case 8-> System.out.println("August");
            case 10-> System.out.println("Sept");
            case 11-> System.out.println("November");
            case 12-> System.out.println("Dec");
            case 9-> System.out.println("Oct");
            default -> System.out.println("sorry... we have only 12 months");
        }
        sc.close();

    }
}
