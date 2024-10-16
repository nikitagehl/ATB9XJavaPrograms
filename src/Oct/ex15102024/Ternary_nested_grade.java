package Oct.ex15102024;

public class Ternary_nested_grade {
    public static void main(String[] args) {
        int score= 78;

        char grade= score>=90?'A':(score>=80&&score<=89?'B':(score>=70&&score<=79?'C':(score>=60&&score
        <=69?'D':'F')));
        System.out.println(grade);
    }
}

