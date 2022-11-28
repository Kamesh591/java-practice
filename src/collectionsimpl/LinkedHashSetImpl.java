package collectionsimpl;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetImpl {

    public static void main(String[] args) {

        LinkedHashSet hashSet= new LinkedHashSet();
        hashSet.add('A');
        hashSet.add('B');
        hashSet.add(10);
        hashSet.add(null);
        hashSet.add("Kamesh");
        System.out.println(hashSet.add('A'));
        System.out.println(hashSet);
    }
}
