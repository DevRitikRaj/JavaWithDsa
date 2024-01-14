package Oops;

public class trickyquestion {
    public static void main(String [] args){
        A ob=new B();
        ob.one();
        A ob2 =new A();
        ob2.one();


    }
}

class A{
    void one(){
        System.out.println("One");
    }
}

class B extends A{
    void two(){
        System.out.println("Two");
    }
}
