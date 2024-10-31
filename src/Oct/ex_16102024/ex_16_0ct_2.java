package Oct.ex_16102024;

import java.util.Scanner;

public class ex_16_0ct_2 {
    public static void main(String[] args) {
        // second way to get input is scanner class

        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int num= sc.nextInt();

//        String s= sc.next();/// use this for srting inputs
//        float f= sc.nextFloat(); // this for float value
//        byte b = sc.nextByte(); // this is for byte value.
//        boolean bl= sc.nextBoolean(); // this is for boolean value.
//        double d= sc.nextDouble(); // this is for double.

        System.out.printf("your entered number is %d",num);

    }
}
