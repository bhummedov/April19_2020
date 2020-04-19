package HashMap;

import java.util.Enumeration;
import java.util.Hashtable;

public class RemoveIterator {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> numbers = new Hashtable<>(20);
        for (int i = 0; i < 11 ; i++) {
            numbers.put(i,i*2);
        }
        System.out.println(numbers);
        Enumeration<Integer> iter = numbers.keys();

        while(iter.hasMoreElements()){
            Integer key=iter.nextElement();
            if(key>7){
                numbers.remove(key);
            }
        }
        System.out.println(numbers);
    }
}

