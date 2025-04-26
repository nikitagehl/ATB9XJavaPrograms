package Nov.ex_22_nov_map;

import java.util.HashMap;
import java.util.Map;

public class lab203_map_p1 {
    public static void main(String[] args) {

        // map is always in key value pair
        // it is similar to json
        // it is like dictionary in python

        Map m1= new HashMap();
        m1.put("name", "nikita");
        m1.put("roll_no", 123);
        m1.put("add", "pipliya");

        System.out.println(m1);
    }
}
