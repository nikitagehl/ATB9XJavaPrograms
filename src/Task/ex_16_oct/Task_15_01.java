package Task.ex_16_oct;

import java.util.Scanner;

public class Task_15_01 {
    public static void main(String[] args) {
//        Take a user input - Name, Age and Salary and print them in the end.

        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name.... ");
        String name= sc.nextLine();

        System.out.println("enter your age.... ");
        byte age= sc.nextByte();

        System.out.println("enter your salary.... ");
        int salary= sc.nextInt();

        System.out.printf("hey %s, your age is %d and your salary is %d",name,age,salary);

    }
}
