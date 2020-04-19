package HashMap;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeMap;

public class UniqueHashSetCharacter {
    public static void main(String[] args) {
     System.out.println(unigueHashSet());
    }
    public static boolean unigueHashSet() {
        String str = "abcde";
        HashSet <Character>hs=new HashSet();
        for(int i=0; i < str.length(); i ++)   {
                if(!hs.add(str.charAt(i)))
                    return false;
        }

            return true;
        }
}

