package collectionsimpl;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetImpl {

    public static void main(String[] args) {

        HashSet hashSet= new HashSet();
        hashSet.add('A');
        hashSet.add('B');
        hashSet.add(10);
        hashSet.add(null);
        hashSet.add("Kamesh");
        System.out.println(hashSet.add('A'));

        System.out.println(hashSet);
        ArrayList arrayListSet= new ArrayList();
        arrayListSet.add('A');
        arrayListSet.add('B');
        arrayListSet.add(10);
        arrayListSet.add(null);
        arrayListSet.add("Kamesh");
        System.out.println(arrayListSet.add('A'));
        System.out.println(arrayListSet);
    }
}
