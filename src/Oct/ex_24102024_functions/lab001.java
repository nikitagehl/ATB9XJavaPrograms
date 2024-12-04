package Oct.ex_24102024_functions;
import java.util.Scanner;
public class lab001 {
    public static void main(String[] args){
// Online Java Compiler
// Use this editor to write, compile and run your Java code online


                System.out.println("Welcome to online calculating system.");
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter a number 1");

                int n1 =  sc.nextInt();
                System.out.println("Enter a number 2");

                int n2 =  sc.nextInt();

                System.out.println("enter your choice +,-,/,*");
                String ch= sc.next();
                switch(ch){
                    case "+":
                    {
                        int sum = n1+n2;
                        System.out.println("sum is "+ sum);
                        break;

                    }
                    case "-":
                    {
                        int sum = n1-n2;
                        System.out.println("sum is "+ sum);
                        break;

                    }
                    case "*":
                    {
                        int sum = n1*n2;
                        System.out.println("sum is "+ sum);
                        break;

                    }
                    case "/":
                    {
                        int sum = n1/n2;
                        System.out.println("sum is "+ sum);
                        break;

                    }
                    default:
                    {

                        System.out.println("Enter correct choice");
                        break;

                    }
                }


    }
}
