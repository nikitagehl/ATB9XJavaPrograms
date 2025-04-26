package Nov.ex_22_nov_map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class lab207_hashTable_p5 {

    public static void main(String[] args) {
        Hashtable<Integer,String> ht1= new Hashtable();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        System.out.println(ht1);
        System.out.println(" -- ");

//        Null values are not allowed in hashtable
        //  ht1.put(3, null); // java.lang.NullPointerException
        // ht1.put(null, "four");

        Enumeration<Integer> e  = ht1.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }
    }
}
