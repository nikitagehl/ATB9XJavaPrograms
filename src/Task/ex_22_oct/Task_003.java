package Task.ex_22_oct;

public class Task_003 {
    public static void main(String[] args) {
//        Palidrome of String (chatAt())
        String st= "nikki";
        String nst="";
        System.out.println(st.length());
        for (int i=st.length()-1;i>=0;i--){

            nst= nst+st.charAt(i);
        }
        System.out.println(nst);
        if(st.toLowerCase().equals(nst.toLowerCase())){
            System.out.println("this is a palindrome string");
        }
        else System.out.println("not a palimdrome");
    }
}
