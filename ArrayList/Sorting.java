package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sorting {
    
    public static void main(String args[]){
         ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(21);
        list.add(1);
        list.add(44);
        list.add(15);
        list.add(5);
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Decending Order");

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        

    }
}
