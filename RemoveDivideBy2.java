/* How to safely remove the elements while iterating over a collection */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program5 {

    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(3);
        list.add(7);

       Iterator<Integer> itr = list.iterator();

       while (itr.hasNext()) {

        Integer num = itr.next();

        if(num % 2 == 0){
            itr.remove();;
        }else{
            System.out.println(num);
        }
        
       }
    }
}
