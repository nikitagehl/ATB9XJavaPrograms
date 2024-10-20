package Oct.ex_18102024_switch_case;


import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {
//        Create a simple calculator that performs addition,
//        subtraction, multiplication, and division,
//        modus based on user input using switch statements.
//
//                Inputs :   num 1, num 2, +
//                Output :  num1+num2 → print information.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter two numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        System.out.println("Enter you choice here.... ");
        String ch= sc.next();

        switch (ch){
            case "add":
              int sum=  n1+n2;
                System.out.println("sum is "+sum);
                break;
            case "substract":
                int sub=  n1-n2;
                System.out.println("sum is "+sub);
                break;
            case "multiplication":
                int mul=  n1*n2;
                System.out.println("sum is "+mul);
                break;
            case "division":
                int div=  n1/n2;
                System.out.println("sum is "+div);
                break;
            default:{
                System.out.println("please select the correct choice");
            }
        }


    }
}
