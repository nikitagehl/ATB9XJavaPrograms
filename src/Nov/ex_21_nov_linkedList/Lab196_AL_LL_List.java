package Nov.ex_21_nov_linkedList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Lab196_AL_LL_List {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.add("node1");
        list.add("node2");
        list.add("node3");

        System.out.println(list);
        // vector is a legacy classes -> It is old classes that are introduced in before collection framework
        System.out.println("..................");
        List myList= new ArrayList();
        myList.add("node1");
        myList.add("node2");
        myList.add("node3");
        System.out.println(myList);
        }

}
