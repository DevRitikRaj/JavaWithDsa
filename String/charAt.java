package String;

public class charAt {
    public static void count(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String [] a){
        String str="Ritik";
        count(str);

    }
    
}
