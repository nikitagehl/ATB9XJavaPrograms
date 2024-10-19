package Oct.ex17102024_Ifelse;

import java.util.Scanner;

public class if_else_02 {
    public static void main(String[] args) {
        // even odd program

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("number is even");

        }
        else {
            System.out.println("number is odd");
        }
        sc.close();
    }
}
