package Nov.Ex_08_nov_polymorphism;

public class lab001_overloading {
    public static void main(String[] args) {
        opertaion op= new opertaion();
        op.add(1,2);
      float result=  op.add(8.5f,3);
        System.out.println(result);
    }
    }
class opertaion{
    void add(int a, int b){
        int result= a+b;
        System.out.println(result);

    }

    float add(float a,float b){
        return a+b;
    }

}


