package Oops;

public class staticspractice {

    public static void main(String [] args){
        Test5 t= new Test5();
        Test5.changeB();
        System.out.println(Test5.a+Test5.c);

        // Test.a = 10   and   Test.b =0;

    }
    
}

class Test5{
    static int a=10;
    static int c;

    static void changeB(){
        c= a*3;
    }

}
