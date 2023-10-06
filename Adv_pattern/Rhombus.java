package Adv_pattern;

public class Rhombus {

    public static void RB(int n){

        for(int i=1;i<=n;i++){

            // space

            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }

            //Star

            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.println();



        }
        

    }
    public static void main(String [] args){
        RB(4);
    }
    
}
