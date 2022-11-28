package collectionsimpl;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetImpl1 {

    public static void main(String[] args) {

        TreeSet treeSet= new TreeSet();

        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("D"));
        treeSet.add(new StringBuffer("C"));
        System.out.println(treeSet);
    }
}
