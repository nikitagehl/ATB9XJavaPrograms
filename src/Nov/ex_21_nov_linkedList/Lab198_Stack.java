package Nov.ex_21_nov_linkedList;

import java.util.Stack;

public class Lab198_Stack {
    public static void main(String[] args) {
        Stack s= new Stack();

        s.add("nik");
        s.add("gehlod");
        s.push(123);

        s.add("nikkita");
        s.add("nik");
        s.add(3,"ins");

        s.remove("gehlod");
        System.out.println(s.isEmpty());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.search(123)); // index of an element
        System.out.println(s);

        System.out.println(s.get(2));
        System.out.println(s.get(4));
    }
}

