package Oops;

public class first {

    public static void main(String [] args){
        Pen p=new Pen();
        p.setColor("Red");
        p.setTip(5);
        System.out.println(p.color);
        System.out.println(p.tip);
    }
    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;

    }

    void setTip(int newTip){
        tip=newTip;
    }
}
