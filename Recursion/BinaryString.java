public class BinaryString {

    public static void Strings(int n,int lastplace,String str){
        // Base Case
        if(n==0){
            System.out.println(str);
            return;
        }

        //Kaam

        Strings(n-1, 0, str+"0");

        if(lastplace==0){
            Strings(n-1, 1, str+"1");
        }


    }

    public static void main(String [] args){
    Strings(3, 0, "");


    }
}
