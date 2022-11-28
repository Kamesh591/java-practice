package collectionsimpl;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorImpl {

    public static void main(String[] args) {

        ArrayList arrayList= new ArrayList();
        arrayList.add("Balakrishna");
        arrayList.add("Venki");
        arrayList.add("Chiru");
        arrayList.add("Nag");
        System.out.println(arrayList);

        ListIterator listIterator= arrayList.listIterator();
        while (listIterator.hasNext()){
            String s= (String) listIterator.next();
            if (s.equals("Venki")){
                listIterator.remove();
            }
            else if (s.equals("Nag")){
                listIterator.add("Chaitu");
            }
            else if (s.equals("Chiru")){
                listIterator.set("Chran");
            }
        }
        System.out.println(arrayList);

        System.out.println(listIterator.getClass().getName());
    }
}
