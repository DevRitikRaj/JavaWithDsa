package Abstraction;

public class abstactionConstructor {
    public static void main(String [] args){
        Three ob=new Three();
        

    }
}

abstract class One{
    One(){
        System.out.println("Constructor One is Called");
    }
}

class Two extends One{
    Two(){
        System.out.println("Constructor Two Called");
    }
}

class Three extends Two{
    Three(){
        System.out.println("Constructor Three is called");
    }
}
