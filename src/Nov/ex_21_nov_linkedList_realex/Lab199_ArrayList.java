package Nov.ex_21_nov_linkedList_realex;

import java.util.ArrayList;
import java.util.List;

public class Lab199_ArrayList {
    public static void main(String[] args) {
        Students s1= new Students("nikita",1);
        Students s2= new Students("nik",2);
        Students s3= new Students("nikki",3);

        List<Students> list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);


        s1.pritDetails();
        System.out.println(list);


    }
}
