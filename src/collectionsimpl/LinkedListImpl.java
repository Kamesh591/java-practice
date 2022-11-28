package collectionsimpl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;

public class LinkedListImpl {

    public static void main(String[] args) {

        LinkedList linkedList= new LinkedList();
        linkedList.add('A');
        linkedList.add(10);
        linkedList.add("Kamesh");
        System.out.println(linkedList);
        linkedList.addFirst("Ram");
        System.out.println(linkedList);
        linkedList.addLast("Raidu");
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        linkedList.add(4,"SUndaresh");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

       // Enumeration e= linkedList.elem

        ArrayList al= new ArrayList(linkedList);
    }
}
