package Arrays;

public class TrappedWater {

    public static int trappWater(int height[]){
        int n=height.length;

        //for make a axulary array (Max left Array)

        int leftMax[]= new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }


        // for make the axualry array for Max right array

        int RightMax[]=new int [n];
        RightMax[n-1]=height[n-1];

        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }

        int trappWater=0;


        for(int i=0;i<n;i++){
            int WaterLevel= Math.min(leftMax[i], RightMax[i]);
            trappWater+=WaterLevel-height[i];
        }

        return trappWater;

    }

    public static void main(String [] args){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappWater(height));
    }
    
}
