package Recursion;

public class LastOccurence {

    public static int Check(int n[],int key,int i){
        if(i==n.length){
            return -1;
        }

        int found= Check(n, key, i+1);
        if(found==-1 && n[i]==key){
            return i;
        }
        return found;
    }

    public static void main(String [] args){
        int arr[]={1,2,3,4,5,6,7,5,9};
        System.out.println(Check(arr, 5, 0));

    }
    
}
