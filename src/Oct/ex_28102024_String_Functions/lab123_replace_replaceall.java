package Oct.ex_28102024_String_Functions;

public class lab123_replace_replaceall {

    public static void main(String[] args) {

        String original = "banana";
        String result1 = original.replace('a', 'o');
        System.out.println(result1);

        String original1 = "Hello123 World456!";
        String result2 = original1.replaceAll("\\d+", "+1");
        System.out.println(result2);


        String result3 = original1.replaceAll("o", "O");
        System.out.println(result3);


    }
}
