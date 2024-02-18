package ArrayList;

import java.util.*;

public class ParingSum1 {

    public static boolean pairsum1(ArrayList<Integer> list,int target){

        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){

               // Case -1
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }

            // Case - 2
            if(list.get(lp)+list.get(rp)<target){
               lp++;
            }
            else{

                // Case -3 
                rp--;
            }

        }

        return false;

    }

    public static void main(String [] args){
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        int target=9;
        Collections.sort(list);
        System.out.println(list);
        System.out.println(pairsum1(list, target));
    }
    
}
