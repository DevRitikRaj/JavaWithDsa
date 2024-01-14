package Oops;

public class staticspractice {

    public static void main(String [] args){
        Test t= new Test();
        t.changeB();
        System.out.println(Test.a+ Test.b);

        // Test.a = 10   and   Test.b =0;

    }
    
}

class Test{
    static int a=10;
    static int b;

    static void changeB(){
        int b= a*3;
    }

}
