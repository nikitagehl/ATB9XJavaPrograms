package Nov.ex_18_nov_Exception;

public class lab182_parent_class_exception {
    public static void main(String[] args) {
        int a=10;

        try {
            int c= a/0;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        catch(Throwable e){ // this is a parent class of exception
            System.out.println(e.getMessage());
        }

        System.out.println("hello I am throwable class");
    }
}
