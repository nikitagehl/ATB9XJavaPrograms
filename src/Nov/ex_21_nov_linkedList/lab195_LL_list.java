package Nov.ex_21_nov_linkedList;

import java.util.LinkedList;
import java.util.List;

public class lab195_LL_list {
    public static void main(String[] args){
        LinkedList myList= new LinkedList();

        // duplicates are allowed in LL

        List myLL= new LinkedList(); // dynamic dispatch
        myList.add("nik");
        myList.add("nik");
        myList.add("gehlod");
        myList.add("nik");
        myList.add("nik");

        myList.remove("nik");
        System.out.println(myList.size());

        System.out.println(myList);

//       LL is used in  selenium -> insert or deletion operation,

    }
}
