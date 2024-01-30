package Leetcode;

public class leetcode_35 {

    public static int Search(int num[],int tar){

        int si=0;
        int ei=num.length-1;
        while (si<=ei) {
            int mid=si+(ei-si)/2;
            if(num[mid]==tar){
                return tar;
            }

            else if (num[mid]<tar) {
                si=mid+1;
                
            }
            else{
                ei=mid-1;
            }
            
        }
        return si;
       
                       
        }
       
    
    public static void main(String [] args){
        int arr[]={1,3,5,6};
        int tar=2;
        System.out.println(Search(arr, tar));
    }

    
}
