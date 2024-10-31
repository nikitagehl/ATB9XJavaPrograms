package Task.ex_22_oct;

public class Task_001 {
    public static void main(String[] args) {
//        Reverse the number using for loop. (In - 12345, Out - 54321)

        int num= 789234;
        int rem=0;
        int num1=0;
        for(int i=0;num>0;i++){
            rem= num%10;
            num=num/10;
            num1= rem+num1*10;
            System.out.println(rem);
        }
        System.out.println(num1);
    }
}
