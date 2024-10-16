package Oct.ex15102024;

public class Nested_ternary_operator {
    public static void main(String[] args) {
        // maximum between three numbers
        int a=100,b=25,c=200;
        int max= a>b?(a>c?a:c):(b>c?b:c);
        System.out.printf("max number between %d, %d and %d is %d",a,b,c,max);
    }
}
