package Task.ex_16_oct;

public class Task_15_02 {
    public static void main(String[] args) {
        int a= Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        System.out.printf("The two numbers are %d %d \n",a,b);

        int max=a>b?a:b;
        System.out.printf("The maximum number between %d and %d is %d",a,b,max);
    }
}
