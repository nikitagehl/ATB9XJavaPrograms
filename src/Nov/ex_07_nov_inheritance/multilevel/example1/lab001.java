package Nov.ex_07_nov_inheritance.multilevel.example1;

public class lab001 {
    public static void main(String[] args) {
            son son= new son();
            son.home();

        System.out.println(son.gold);

        son.father();

        Father ft= new Father();

        ft.father();
    }
}
