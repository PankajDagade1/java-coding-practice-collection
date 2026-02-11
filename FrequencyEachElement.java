/* How to find the frequency of each element in a list */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyEachElement {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(60);
        list.add(40);
        list.add(40);
        list.add(200);
        list.add(200);
        list.add(200);

        Map<Integer, Integer> freq = new HashMap<>();

        for(Integer num : list) {

            if(freq.containsKey(num)) {
                freq.put(num, freq.getOrDefault(num, 0)+ 1);
            } else {
                freq.put(num , 1);;
            }

        }
        System.out.println(freq);
        
    }
}
