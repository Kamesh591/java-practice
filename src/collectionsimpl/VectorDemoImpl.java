package collectionsimpl;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemoImpl {

    public static void main(String[] args) {

        Vector vector = new Vector();
        vector.add('A');
        vector.add('B');
        vector.add(10);
        vector.add(10);
        vector.add(2, "Ram");
        System.out.println(vector);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        vector.add(60);
        System.out.println(vector.capacity());
        vector.add("Radha");
        System.out.println(vector.capacity());

        Enumeration enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
