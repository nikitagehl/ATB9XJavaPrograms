package Oct.ex_25102024_Strings;

public class lab118 {
    // We can create a string in two ways
    public static void main(String args[]) {


        String s1 = "nikita"; /// this is immutable string

        String s2 = new String("nik"); // it will create a new area in heap.

        System.out.println(s1);
        System.out.println(s2);
    }
}
