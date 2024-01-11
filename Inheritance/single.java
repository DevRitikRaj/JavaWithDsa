package Inheritance;

public class single {
    public static void main(String [] args){
        B obj=new B();
        obj.A();
    }


    
}

class B extends single{
    String color;

    void A(){
        System.out.println("A");
    }
}
