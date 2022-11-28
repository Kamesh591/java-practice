package collectionsimpl.comparatorimpl;

import java.util.TreeSet;

public class ComparatorImpl {

    public static void main(String[] args) {

        TreeSet treeSet= new TreeSet<>( new OurComparator());
        treeSet.add(20);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(25);
        treeSet.add(22);
        System.out.println(treeSet);
    }
}
