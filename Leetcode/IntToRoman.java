package Leetcode;

public class IntToRoman {

    public static char value(int n){

        switch (n) {
            case 1: return 'I';
            case 5: return 'V';
            case 10: return 'X';
            case 50: return 'L';
            case 100: return 'C';
            case 500: return 'D';
            case 1000: return 'M';         
            default : return 0;
                
        }
       
        
    }
    public static int  Conv(String str){
        int n=str.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char ch1=str.charAt(i);

            if((i+1)<n && value(ch1)< value(str.charAt(i+1))){
                sum=sum-value(ch1);
            }
            else{
                sum=sum+value(ch1);
            }
        }

        return sum;
        

    }






    public static void main(String [] args){
        int res=Conv("VI");
        System.out.println("The result is "+res);

    }

    
}
