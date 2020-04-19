package HashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashTableVsHashMap {
//    public static void main(String[] args) {
//        TreeMap<String, Integer> tree = new TreeMap<>();
//        tree.put("Vahit",100);
//        tree.put("Shohrat",100);
//        tree.put("Rumeyse",100);
//        tree.put("Melih",100);
//        tree.put("Ali",100);
//    //System.out.println(ht);
//    Set<String> keys = tree.keySet();
//    Iterator<String> iter = keys.iterator();
//    String key;
//        while (iter.hasNext()) {
//        key = iter.next();
//        System.out.println(key + " = " + tree.get(key));
//    }
//}

    public static void main(String[] args) {
        //Natural ordering by deafult
        TreeMap<String,Integer> pairs = new TreeMap<>();
        pairs.put("Agamyrat",200);
        pairs.put("Bilbil",200);
        pairs.put("Maral",200);
        pairs.put("Esra",200);
        pairs.put("Berdi",200);
        pairs.put("Melih",200);
        Iterator <String> myIter= pairs.keySet().iterator();
        while (myIter.hasNext()){
            System.out.println(myIter.next()+" = "+pairs.get(myIter.next()));
        }
    }
}

