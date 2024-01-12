package Polymorpshim;

public class Overriding {
    public static void main(String [] args){
        Bird b=new Bird();
        b.eat();
        Animal a=new Animal();
        a.eat();

    }
    
}


class Animal{
    void eat(){
        System.out.println("Eating Everthing");
    }
}

class Bird extends Animal{
    void eat(){
        System.out.println("Eating Instects");
    }
}
