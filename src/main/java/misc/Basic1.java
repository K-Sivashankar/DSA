package misc;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Basic1 {
    public static void main(String[] args) {


        int a = 10;
        int b = 10;
//        a.equals(b);
//        For primitive you cant use equals method
//        You can use only == to comapre for primitive method
        System.out.println();
// ArrayList is heterogeneous
        ArrayList list = new ArrayList();
        list.add(2);
        list.add("Hello");
        list.add(true);
        list.add(false);
        list.add(5.6);

        System.out.println(list);

//


        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(1);
        arrayDeque.offer(5);
        arrayDeque.offer(10);
        System.out.println("ArrayDeque::"+arrayDeque);

    }
}
