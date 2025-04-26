package Nov.ex_21_nov_linkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab197_AL_Iterator {
    public static void main(String[] args) {
        List L1= new ArrayList();

        L1.add(1);
        L1.add(2);
        L1.add(4);
        System.out.println(L1);
        // iterator by for loop
        for (int i = 0; i < L1.size(); i++) {
            System.out.println(L1.get(i));
        }

        System.out.println(" ............for each ");
        // iterate by for each loop

        for( Object o:L1){
            System.out.println(o);
        }

        System.out.println("...........Iterator");

        Iterator iterator= L1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
