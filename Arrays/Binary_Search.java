package Arrays;

public class Binary_Search {
    public static int binary(int n[],int key){
        int start=0;
        int end=n.length-1;
        while(start<=end){
            int mid=(start+end) / 2 ;
            if(n[mid]==key){
                return mid;
            }
            if(n[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;


    }
    public static void main(String [] args){
        int n[]={1,3,4,56,6};
        int key=4;
        int search=binary(n, key);
        System.out.println("The index of the key is "+search);
    }
    
}
