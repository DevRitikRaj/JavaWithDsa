package Interface;

public class Statickeyword {
    public static void main(String [] args){
        Student ob1= new Student();
        ob1.SchoolName="VID";
        System.out.println(ob1.SchoolName);
        Student ob2=new Student();
        System.out.println(ob2.SchoolName); // First time create or Once time created

    }
    
}

class Student{
    String name;
    int roll;
    static String SchoolName;

    void setName(String newName){
        this.name=newName;
    }

    String getName(){
        return this.name;
    }
}
