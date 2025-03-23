package Nov.ex_15_nov_Wrapper;

public class lab174_exception_example {
    public static void main(String[] args) {

            String s2= args[0]; //.ArrayIndexOutOfBoundsException

            int a1= Integer.parseInt(s2);// if I pass any other type value like string, float or boolean, it gives me - NumberFormatException

            int c= 100/a1;// if I pass 0 value.- arithmatic exception
            System.out.println(c);



        }
    }

// main method - staring a program
// collect the arguments from edit config
// assign that argu to string varialbe
// convert from string to int
// operate the arithmatic logic - 1000/arg;
// print the value of executed program
// end the program


// If any problem occurs -> JVM directly terminate the program.
