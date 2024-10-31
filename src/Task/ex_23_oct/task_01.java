package Task.ex_23_oct;

import java.util.Scanner;

public class task_01 {

//    Create a Function of Sub, Sum, Mul and Div with parameter, a, b
//    (take the parameter from the User)

    public static void main(String[] args) {
        System.out.println("welcome to our calculator.... ");
        System.out.println("enter 1st number ");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("enter 2nd number ");
        int b= sc.nextInt();

int result;
        System.out.println("enter what you want to perform +,-,*,/");
        String st= sc.next();

        switch (st){
            case "+":
              result=   sum(a,b);
              break;
            case "*":
                result=   mul(a,b);
                break;
            case "-":
                result=   sub(a,b);
                break;
            case "/":
                result=   div(a,b);
                break;
            default:
                result= 0;
                break;

        }
        System.out.println(result);

        sc.close();

    }

    static int sum(int x, int y){
        return x+y;
    }

    static int sub(int x, int y){
        return x-y;
    }
    static int mul(int x, int y){
        return x*y;
    }
    static int div(int x, int y){
        return x/y;
    }
}
