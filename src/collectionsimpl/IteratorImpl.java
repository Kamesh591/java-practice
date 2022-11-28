package collectionsimpl;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorImpl {

    public static void main(String[] args) {

        ArrayList arrayList= new ArrayList();

        for (int i=0; i<10;i++){
            arrayList.add(i);
        }

        Iterator iterator= arrayList.iterator();

        while (iterator.hasNext()){
            Integer integer= (Integer) iterator.next();
            if (integer%2==0){
                System.out.println(integer);
            }
            else{
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
