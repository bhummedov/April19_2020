package HashMap;

import java.util.HashSet;

public class HashSetMethod {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        System.out.println(hs);
        hs.add(2);
        System.out.println(hs);
        hs.add(2);
        System.out.println(hs);
        hs.add(1);
        System.out.println(hs);
        int[] arr = new int[hs.size()];
        hs.toArray();
    }
}
