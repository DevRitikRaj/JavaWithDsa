package String;

public class lexicographival {
   public static void main(String [] asd){

    String fruit[]={"Mango", "Apple", "Banana"};
    String largest=fruit[0];
    for(int i=1;i<fruit.length;i++){
        if(largest.compareTo(fruit[i])<0){
            largest=fruit[i];
        }

    }
    System.out.println(largest);

   }
    
}
