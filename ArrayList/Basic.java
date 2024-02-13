package ArrayList;
import java.util.ArrayList;

public class Basic {
    public static void main(String [] args){

        // Syntax of the ArraysList
        ArrayList <Integer> list =new ArrayList<>();

      // Add the Element

      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      list.add(5);
      list.add(6);
      System.out.println(list);
      System.out.println("--------------------");


      System.out.println("Get Element");
      list.get(2);
      System.out.println(list);

      System.out.println("--------------------------");

      System.out.println("Get Remove");
      list.remove(2);
      System.out.println(list);
      System.out.println("----------------------");


      System.out.println("Set Element at index");

      list.set(1, 55);
      System.out.println(list);
      System.out.println("-----------------");

      System.out.println("Contianing / Available or not");

      System.out.println(list.contains(1));
      System.out.println(list.contains(22));

















    }
    
}
