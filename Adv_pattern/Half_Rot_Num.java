package Adv_pattern;

public class Half_Rot_Num {

    public static void Num(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);

            }
            System.out.println();
        }


    }

    public static void main(String []a){
        Num(5);
    }
    
}
