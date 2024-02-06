package Backtracking;

public class PermutationString {

    public static void Permu(String str, String ans){

        //Base Case

        if(str.length()==0){
            System.out.println(ans);
            return;

        }

        // Recursion

        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newString=str.substring(0, i)+str.substring(i+1);
            Permu(newString, ans+curr);

           
        }

        



    }

    public static void main(String [] args){
        String str="abc";
        Permu(str, "");
            
    }
    
}
