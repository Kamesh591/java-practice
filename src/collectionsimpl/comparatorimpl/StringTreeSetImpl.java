package collectionsimpl.comparatorimpl;

import java.util.TreeSet;

public class StringTreeSetImpl {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("Ram");
        treeSet.add("Logic");
        treeSet.add("Alum");
        treeSet.add("Zumigo");

        System.out.println(treeSet);
        TreeSet treeSet2 = new TreeSet(new StringComparator());
        treeSet2.add("Ram");
        treeSet2.add("Logic");
        treeSet2.add("Alum");
        treeSet2.add("Zumigo");

        System.out.println(treeSet2);

    }



}
