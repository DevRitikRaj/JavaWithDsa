package Adv_pattern;

public class Floyd_Triangle {

    public static void FT(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String [] ar){
        FT(5);
    }
    
}
