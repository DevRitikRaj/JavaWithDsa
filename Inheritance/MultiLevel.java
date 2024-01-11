package Inheritance;

public class MultiLevel {
    public static void main(String [] args){
        C ob=new C();
        ob.swim();
        ob.color="Red";
        System.out.println(ob.color);

    }
    
}

class B extends MultiLevel{

    int roll;
    void run(){
        System.out.println("RUN");
    }

}

class C extends B{
    String color;
    void swim(){
        System.out.println("Swim");
    }
}
