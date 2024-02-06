package Backtracking;

public class SubString1 {

    public static void Sub(String str, String ans,int i){


        // base Case

        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }

            return;
        }
           // If Your choice is yes
        Sub(str, ans+str.charAt(i), i+1);

        // If you want to No
        Sub(str, ans, i+1);


    }

    public static void main(String [] args){
        String str="abc";
        Sub(str, "", 0);
    }
    
}
