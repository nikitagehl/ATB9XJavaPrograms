package Nov.ex_07_nov_inheritance.singleInheritance.example1;

public class SI {
    public static void main(String[] args) {
         testcase1 tc= new testcase1();
         tc.login(10,"jwt");


        testcase1 tc2= new testcase1();
        tc.login(1,"jwt");
        tc2.tc();
//        tc2.token;
    }
}
