package Leetcode;

public class leetcode_66 {
    public static int[] plusone(int n[]){
        int x=n.length-1;
        while (x>=0 && n[x]==9) {
            x--;
            
        }

        if(x==-1){
            int res[]=new int[n.length+1];
            res[0]=1;
            return res;
        }

        int res[]=new int[n.length];
        res[x]=n[x]+1;
        for(int y=0;y<x;y++){
            res[y]=n[y];
        }

        return res;
        
      
    }

    public static void main(String [] args){
        int arr[]={1,2,3};
       int newarr[]=plusone(arr);
       for(int i=0;i<newarr.length;i++){
        System.out.print(newarr[i]+" ");
       }
       System.out.println();
    }


    
}
