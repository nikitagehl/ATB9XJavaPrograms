package Task.ex_22_oct;

public class Task_002 {
    public static void main(String[] args) {
//        Count vowels and consonants in a String.
        String st= "hello world ";
        int v=0,c=0;
        for(int i=0;i<st.length();i++){
            char ch= st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
            else v++;

        }
        System.out.println("number of vovels are"+c);
        System.out.println("number of consonants are "+v);

    }
}
