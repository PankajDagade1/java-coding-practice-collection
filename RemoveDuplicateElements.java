/*Write a program to remove duplicates from a list */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {

    public static void main(String[] args) {
        
        List<Integer> dup = new ArrayList<>();
        dup.add(10);
        dup.add(20);
        dup.add(10);
        dup.add(30);
        dup.add(10);
        dup.add(20);
        dup.add(30);
        dup.add(20);

        Set<Integer> uniqueElement = new HashSet<>();
        uniqueElement.addAll(dup);

        // Not in Sorted Order
        System.out.println(uniqueElement);

        // Sorted Order
        Set<Integer> orderMatain = new TreeSet<>();
        orderMatain.addAll(uniqueElement);

        System.out.println(orderMatain);

    }
}
