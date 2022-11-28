package collectionsimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class ArrayListImpl {

    public static void main(String[] args) {

        ArrayList al= new ArrayList();

        ArrayList arrayList= new ArrayList();
        arrayList.add(10);
        arrayList.add(10.5);
        arrayList.add("Sample");
        al.add(10);
        al.add('A');
        al.add("Kamesh");
        al.add(null);
        System.out.println(al);
        System.out.println(al.size());
       al.remove("Kamesh");
         System.out.println(al);
        al.addAll(arrayList);
        System.out.println(al);
       al.removeAll(arrayList);
        System.out.println(al);
        System.out.println(al.isEmpty());
        System.out.println(al.contains(null));

       /*  System.out.println(al instanceof RandomAccess);
        System.out.println(al instanceof Serializable);
        System.out.println(al instanceof Cloneable);*/
    }
}
