package Nov.ex_22_nov_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lab206_map_join_2_maps {

    public static void main(String[] args) {
        Map m1= new HashMap();

        m1.put("name","nikita");
        m1.put("id",23);
        m1.put("add","pipliya");
        m1.put("phone",1234567);


        Map m2= new HashMap();
        m2.put("name","gehlod");
        m2.put("id",2);
        m2.put("add","barwaha");
        m2.put("phone",0234567);


        List list= new ArrayList();

        list.add(m1);
        list.add(m2);

        System.out.println(list);
    }
}
