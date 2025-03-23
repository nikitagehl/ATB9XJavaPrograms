package Task.Nov.ex_08_nov;

public class ToString {

    public static void main(String[] args) {
        ATB s1= new ATB("nik",101,true);
        ATB s2= new ATB("adi",102,true);
        ATB s3= new ATB("nikita",103,false);
        ATB s4= new ATB("nikkkki",104,false);
        ATB s5= new ATB("nikkkkku",105,true);

        String ATBStudents[]= {s1.toString(),s2.toString(),s3.toString(),s4.toString(),s5.toString()};

//        System.out.println(s1.toString());
        for (int i = 0; i <ATBStudents.length ; i++) {
            System.out.println(ATBStudents[i]);
        }


    }
}
