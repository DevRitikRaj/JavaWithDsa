package Inheritance;

public class Hiearchial {
    public static void main(String [] args){
        Bird b= new Bird();
        b.fly();
        Mammal m=new Mammal();
        m.Bark();

    }
    
}

class Animal{
    void eat(){
        System.out.println("Eat");
    }

    void Bark(){
        System.out.println("Bark");
    }
}


class Mammal extends Animal{
    String color;
    void swim(){
        System.out.println("Swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("FLY");
    }
}
