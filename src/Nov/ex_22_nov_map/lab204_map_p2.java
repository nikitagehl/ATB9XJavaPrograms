package Nov.ex_22_nov_map;

import java.util.HashMap;
import java.util.Map;

public class lab204_map_p2 {
    public static void main(String[] args) {
        Map   m2= new HashMap(); // generics representation of map

        Map<String, Integer> m3= new HashMap(); // data type fixed (key always be string and value always be in integer

        // all the common methods of map

        m2.put("name", "nikita");
        m2.put("roll_num",123);
        m2.put("add", "pipliya");

        m2.put(null, 1234);

        m2.put("phone",123); // duplicate values are allowed


        m2.put("name", "kikki"); // duplicate keys are not allowed, if you use it will replace your last value to latest value

        System.out.println(m2.size());
        System.out.println(m2.isEmpty());
        System.out.println(m2.containsKey("add"));
        System.out.println(m2.containsKey("Name")); // case sensetive so result is false
        System.out.println(m2.containsValue(123));

        System.out.println(m2.entrySet()); // return all the keys- values

        System.out.println(m2.values());

        System.out.println(m2.get("add"));

        m2.remove("add");
        System.out.println(m2.get("add")); // if not present the key it will return null
        System.out.println(m2);





    }
}
