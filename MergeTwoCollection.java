import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program7 {

    
    public static void main(String[] args) {
        
        /*Merge two List */
        
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
        list1.addAll(list2);
        System.out.println(list1);

         /*Merge two Set */

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(6,7,8,9,10));
        set1.addAll(set2);
        System.out.println(set1);

         /*Merge two Map */

        Map<Integer, Integer> map1 = new HashMap<>();
        map1.put(1, 10);
        map1.put(2, 20);
        map1.put(3, 30);
        map1.put(4, 40);
        map1.put(5, 50);

        Map<Integer, Integer> map2 = new HashMap<>();
        map1.put(6, 60);
        map1.put(7, 70);
        map1.put(8, 80);
        map1.put(9, 90);
        map1.put(10, 100);

        map1.putAll(map2);

        System.out.println(map1);

    }
}
