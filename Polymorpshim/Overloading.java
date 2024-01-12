package Polymorpshim;

public class Overloading {
    public static void main(String [] args){
        Calculator cal=new Calculator();
        int a=cal.sum(10, 15);
        float b=cal.sum(2.5f, 4.5f, 2.6f);
        System.out.println(a);
        System.out.println(b);


    }
    
    
}

class Calculator{
    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b, float c){
        return a+b+c;
    }

   

}