package Leetcode;
public class AddtoBinary {

    public static String Binary(String a, String b){
        int num1=Integer.parseInt(a,2);
        int num2=Integer.parseInt(b,2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum);

        return result;
        

    }

    public static void main(String [] args){
        String a="10";
        String b="01";
        System.out.println(Binary(a, b));
    }

    
}
