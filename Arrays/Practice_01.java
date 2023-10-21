package Arrays;

public class Practice_01 {

    public static void Check(int n[]){
        for(int i=0;i<n.length;i++){

            for(int j=i+1;j<n.length;j++){

                if(n[i]==n[j]){
                   System.out.println("True");
                }
               


            }
        }

        return;
    }


    public static void main(String [] args){
        int a[]={1,2,3,1};
        Check(a);
        
    }
    
}
