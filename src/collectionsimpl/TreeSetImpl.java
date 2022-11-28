package collectionsimpl;

import java.util.TreeSet;

public class TreeSetImpl {

    public static void main(String[] args) {

        TreeSet treeSet= new TreeSet();
       // TreeSet treeSet= new TreeSet();

        System.out.println(((int)'A'));
        System.out.println((int)'a');
        treeSet.add('a');
        treeSet.add('A');
        treeSet.add('C');
        treeSet.add('d');
        treeSet.add('L');
        System.out.println(treeSet);
       // System.out.println();
       // treeSet.add(10); //We get ClassCastException as Hetrogenous objects not allowed

        treeSet.add(null); // NPE
    }
}
