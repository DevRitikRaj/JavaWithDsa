package ArrayList;
import java.util.*;
public class ContainingWaterEg {
    public static int StoreWater(ArrayList<Integer> height){
        int lp=0;
        int rp=height.size()-1;
        int maxheight=0;

        while (lp<rp) {
            // Calculating the height
            int ht=Math.min(height.get(lp), height.get(rp));
            int wid=rp-lp;
            int currWater=ht*wid;
            maxheight=Math.max(maxheight, currWater);

            // Taking Pointer for the remove the array and to optimizing the code

            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return maxheight;

    }
    public static void main(String []args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(StoreWater(list));



    }
    
}
