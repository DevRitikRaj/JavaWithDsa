package Leetcode;

public class Question_26 {

    public static int Sorted(int num[]){
        int j=0;
        for(int i=0;i<num.length;i++){
            if(num[j]!=num[i]){
                j++;
                num[j]=num[i];
            }
        }
        return j+1;


        

        }

        public static void main(String [] args){
            int arr[]={1,1,2,2,3,3,4,4};
            System.out.println(Sorted(arr));
        }
    }

    

