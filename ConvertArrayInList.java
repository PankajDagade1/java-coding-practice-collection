/* Write a program to convert Array to a collection and vice versa */

import java.util.*;

public class Program4 {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        //System.out.println(Arrays.toString(arr));

        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);

        Integer[] c = list.toArray(new Integer[0]); 
        System.out.println(Arrays.toString(c));
        
    }
}
