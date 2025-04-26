package Nov.ex_19_nov_generics;

import java.util.ArrayList;
import java.util.List;

public class lab188_arrayList {
    public static void main(String[] args) {
        List list= new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println(list);
        System.out.println(list.contains(1)); // false- it store string not an integer
        System.out.println(list.isEmpty()); //  false
        System.out.println(list.indexOf("3"));// 2
        System.out.println(list.size());
    }
}
