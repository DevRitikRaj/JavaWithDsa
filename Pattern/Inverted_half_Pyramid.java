package Pattern;

public class Inverted_half_Pyramid {
    public static void main(String [] args){
        for(int i=1;i<=4;i++){
            

            // for spaces

            for(int sp=1;sp<=4-i;sp++){
                System.out.print(" ");
            }



            // for Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            
            System.out.println();
        }
        
    }
    
}
