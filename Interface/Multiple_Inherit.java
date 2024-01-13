package Interface;

public class Multiple_Inherit {
    public static void main(String [] args){
        One one=new One();
        one.move();
        one.walk();

    }
    
}

interface A{
    void move();
}

interface B{
    void walk();
}

class One implements A,B{
    public void move(){
        System.out.println("MOVE");
    }

    public void walk(){
        System.out.println("WALK");
    }
}
