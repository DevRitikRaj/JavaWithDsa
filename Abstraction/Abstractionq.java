package Abstraction;

public class Abstractionq {
    public static void main(String [] args){
        Mammal b=new Mammal();
        b.color();
        
    }
    
}
 abstract class Animal{
    void eat(){
        System.out.println("Eating");  // Non-Abstract Method
    }

    abstract void color(); // Abstract Method

 } 

 class Bird extends Animal{
    void color(){
        System.out.println("Red");
    }
 }

 class Mammal extends Bird{
    void color(){
        System.out.println("Blue");
    }
 }
