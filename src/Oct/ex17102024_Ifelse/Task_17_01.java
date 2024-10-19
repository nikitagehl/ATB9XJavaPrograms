package Oct.ex17102024_Ifelse;

import java.util.Scanner;

public class Task_17_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int num1=sc.nextInt();
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num1>num){
            System.out.println("num1 > num 2");
        } else if (num> num1) {
            System.out.println("num2 > num1");
        }
        else{
            System.out.println("equal");
        }
        sc.close();
    }
}
