/* Write a program to sort a map by values */

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class SortMapValues {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(2, 10);
        map.put(3, 1);
        map.put(4, 4);
        map.put(5, 7);
        map.put(6, 9);
        map.put(7, 2);
        map.put(8, 5);
        map.put(9, 6);
        map.put(10, 8);

        List<Map.Entry<Integer, Integer>> list1 = new ArrayList<>(map.entrySet());

        Collections.sort(list1, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        Map<Integer, Integer> sortedByValue = new LinkedHashMap<>();

        for(Map.Entry<Integer, Integer> entry : list1) {
            sortedByValue.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedByValue);

        

    }
}
