package Oct.ex15102024;

public class Ternary_operator02 {
    public static void main(String[] args) {
        int age=28;
        // lets check who is able to vote.
        String vote= age >18? "you can vote":"you are not able to vote now.";
        System.out.println(vote);
    }
}
