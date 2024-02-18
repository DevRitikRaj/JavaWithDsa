package ArrayList;
import java.util.*;

public class ContainingWater2 {

    public static int StoreWater(ArrayList<Integer> height){
        int lp=0;
        int rp=height.size()-1;
        int maxheight=0;

        while(lp<rp){

            //Calculate Water area
            int ht=Math.min(height.get(lp), height.get(rp));
            int wid=rp-lp;
            int currWater=ht*wid;
            maxheight=Math.max(maxheight, currWater);

            //  Taking pointer
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }


          

        }
        return maxheight;



    }
    public static void main(String [] args){
        ArrayList <Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(StoreWater(height));
    
}

}
