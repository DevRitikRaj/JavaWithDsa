package Backtracking;

public class Substring {

    public static void Sub(String str, String ans,int i){

        // Base Case

        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
            return;
        
        }

        // If You choice have YES
        Sub(str, ans+str.charAt(i), i+1);

        //If You choice NO

        Sub(str, ans, i+1);



        

    }  

    public static void main(String [] args){
        String str="abc";
        Sub(str, "", 0);
    }

    

    
    
    
}
