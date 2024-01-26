package Leetcode;

public class RomanToInteger {

    public static int value(char ch){

        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
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
        int res=Conv("IV");
        System.out.println("The result is "+res);

    }

    
}
