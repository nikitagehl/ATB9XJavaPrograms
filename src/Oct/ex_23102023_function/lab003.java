package Oct.ex_23102023_function;

import java.util.Scanner;

public class lab003 {
    public static void main(String[] args) {
        // 4 types of functions
        // without return type and without parameter

        hello(); // function calling
        hello();

        int a = voting_age();
        if(a>=18){
            System.out.println("you are valid to vote");
        }
        else System.out.println("not able to vote");


        greet_with_name("nikki");

        int result= sum(3,4);
        System.out.println(result);
    }


    // without return type and without parameter ( void) // function declaration/definition
    static void hello(){
        System.out.println("hii, I am nikita ");
    }

    // without parameter and with return type
    static int voting_age(){
        System.out.println("enter your age ");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        return age;
    }


    // with parameter and without return type
    static  void greet_with_name(String a){
        System.out.println("hello ..."+a);
    }


//    with parameter and with return type

    static  int sum(int a, int b){
        return a+b;
    }
}
