package collectionsimpl.map.pack;

import java.util.*;

public class MapGenericImpl {

    public static void main(String[] args) {
        Map map=new HashMap();

        Map map1= new HashMap();
        map1.put(200,"Santosh");
        map1.put(201,"SaMEER");
        map1.put(300,"Raghavendra");
       /* System.out.println(map.isEmpty());
        System.out.println(map.size());*/
        //Adding elements to map
        map.put(101,"Kamesh");
        map.put(102,"Teju");
        map.put(108,"Jaswant");
        map.put(104,"Jahnavi");
        map.put(105,"Sarita");
        map.put(106, "Ramudu");
        System.out.println(map);
      /*  System.out.println(map.size());
        System.out.println(map.isEmpty());*/
       // System.out.println(map.containsKey(109));

        //System.out.println(map.get(102));
      /*  map.remove(101);
        System.out.println(map);

        map.putAll(map1);
        System.out.println(map);
        System.out.println(map1);
        map1.clear();
        System.out.println(map1);*/
      //  System.out.println(map.containsValue("Saritasas"));
        //Traversing Map
      /*  Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/

       /* Set set=map.keySet();
        System.out.println(set);*/

        Collection collection=map.values();
        System.out.println(collection);
    }
}
