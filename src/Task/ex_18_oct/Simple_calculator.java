package Task.ex_18_oct;

import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {
        System.out.println("Simple calculator program.....");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st  numbers");
        double n1= sc.nextDouble();
        System.out.println("enter 2nd numbers");
        double n2= sc.nextDouble();
        System.out.println("What you want to do - +,-,*,/.... ");
        String ch= sc.next();

        switch (ch){
            case "+": {
                double result = n1 + n2;
                System.out.println("Your result is  is " + result);
                break;
            }
            case "-":
            {
                double result = n1 -n2;
                System.out.println("Your result is " + result);
                break;
            }
            case "*":
            {
                double result = n1 * n2;
                System.out.println("Your result is " + result);
                break;
            }
            case "/":
            {
                double result = n1 / n2;
                System.out.println("Your result is " + result);
                break;
            }
            default:{
                System.out.println("please select the correct choice");
            }
        }
        System.out.println("Thankyou ... !! ");
        sc.close();
    }
}
