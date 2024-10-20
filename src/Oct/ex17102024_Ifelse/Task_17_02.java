package Oct.ex17102024_Ifelse;

import java.util.Scanner;

public class Task_17_02 {
//    Write a program that classifies a triangle based on its side lengths.
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the three sides of triangle");
    int s1= sc.nextInt();
//    System.out.println("enter the 2nd side of triangle");
    int s2= sc.nextInt();
//    System.out.println("enter the 3rd side of triangle");
    int s3=sc.nextInt();
    if(s1<=0 || s2<=0 ||s3<=0)
    {
        System.out.println("Invalid data, please enter the positive sides");
    }
//    equilateral (all sides are equal)
    else if(s1==s2 && s1==s3){
        System.out.println("This is an equilateral triangle");
    } else if (s1==s2 || s1==s3 ||(s2==s3)) {
        System.out.println("This is an isosceles Triangle");
    }
    else{
        System.out.println("scalene Triangle");
    }
    sc.close();
}
}
