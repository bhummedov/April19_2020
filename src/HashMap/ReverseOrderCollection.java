package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.TreeMap;

public class ReverseOrderCollection {
    public static void main(String[] args) {
        TreeMap<Integer, String> pairs = new TreeMap<>(Collections.reverseOrder());
        pairs.put(2,"Practice comes next");
        pairs.put(1,"Java is always first order");
        pairs.put(3,"Try understand your answer comes third ");
        System.out.println(pairs);
    }
}
