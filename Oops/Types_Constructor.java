package Oops;

public class Types_Constructor {
    public static void main(String [] args){
        Student3 p1=new Student3();
        Student3 p2=new Student3("Ritik Raj");
        Student3 p3=new Student3(11212808);
        System.out.println(p2.name);
        System.out.println(p3.roll);


    }
    
}
class Student3{

    String name;
    int roll;

    Student3(){
        System.out.println("Non-Parameterize");
    }

    Student3(String name){
        this.name=name;
    }
    Student3(int roll){
        this.roll=roll;
    }
}
