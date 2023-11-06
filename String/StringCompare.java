package String;

public class StringCompare {

    public static void main(String [] args){
        String s1="Ritik";
        String s2="Ritik";
        String s3= new  String("Ritik");
        
        // Comapre 1
        if (s1==s2){
            System.out.println("It is equal");
        }
        else{
            System.out.println("Not Equal");
        }

        //Compare 2

        if (s1==s3){
            System.out.println("It is equal");
        }
        else{
            System.out.println("Not Equal");
        }


        // The we Compare with the help of the "'equals' keyword"

        if (s1.equals(s3)){
            System.out.println("It is equal");
        }
        else{
            System.out.println("Not Equal");
        }






    }
    
}
