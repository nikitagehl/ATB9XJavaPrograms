package Nov.ex_22_nov_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class lab205_map_iterate_p3 {

    public static void main(String[] args) {
        Map<String,Object> students =  new HashMap();

        students .put("id", 1);
        students .put("name", "nikita");
        students .put("phone", 12345678);
        students .put("add", "pipliya");
        students .put("Is_Indian", true);

        System.out.println(students);

        // how to iterate and retrive the values

       for (Map.Entry<String,Object> item: students.entrySet()){
           System.out.println(item.getKey()+":"+item.getValue());
        }
    }
}
