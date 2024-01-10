package Oops;

public class Constructor_02 {
    public static void main(String [] args){
        Student1 p2=new Student1("Ritik");
        System.out.println(p2.name);

    }
    
}

class Student1{
    String name;
    int roll;

    Student1(String name){
        this.name=name;

    }
    
}
