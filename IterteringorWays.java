/* Write a program to iterate a HashMap in three ways */

import java.security.Key;
import java.util.*;
import java.util.Iterator;
import java.util.Map;

public class Program3 {
    public static void main(String[] args) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(10, 5);

        /* 1st way : by using Iterator */
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        Iterator<Map.Entry<Integer, Integer>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();
            System.out.println(entry);
        }

        /* 2nd way : by using for-each loop */
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        /* 3rd way : by using lambda expression */
        map.forEach((key,value) -> {
            System.out.print(key+" "+value);
            System.out.println();
        });
    }
}
