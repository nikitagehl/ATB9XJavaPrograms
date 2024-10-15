package Oct.ex11102024_operators;

public class Arithmatic_operators {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        // arithmetic operators are used to perform mathematical task.

        int add= a+b;
        System.out.printf("sum of %d and %d is %d \n",a,b,add); // addition
        System.out.printf("substraction of %d and %d is %d",a,b,(a-b));
        int exp= ((a*b - a/b)+b);
        System.out.printf("\n expression is %d \n",exp);
        System.out.println(b/a);
        System.out.println("\n" +(b%a));




    }
}
