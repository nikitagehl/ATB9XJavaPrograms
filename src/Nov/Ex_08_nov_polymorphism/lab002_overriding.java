package Nov.Ex_08_nov_polymorphism;

public class lab002_overriding {

    public static void main(String[] args) {
        son s1 = new son();
        s1.home();

    }
}

    class parent{

      void home(){
          System.out.println("Father has 3bhk");
        }
    }

    class son extends parent{
    @Override
        void home(){
            System.out.println("this is my house ");
        }
    }



