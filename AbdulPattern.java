public class AbdulPattern {
    public static void pattern(int n){
        for(int line = 1;line<=n;line++){
            for(int space =1;space<=line-1;space++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        pattern(n);
    }
    
}
