package Recursion;

public class FirstOccurence {

    public static int First(int n[],int key,int i){
        if(n[i]==key){
            return i;

        }

        if(i==n.length-1){
            return -1;

        }

        return First(n, key, i+1);
    }

    public static void main(String [] args){
        int arr[]={1,2,3,4,5,4,5,9};
        System.out.println(First(arr, 5, 0));
    }
    
}
