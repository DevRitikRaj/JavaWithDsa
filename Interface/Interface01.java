package Interface;

public class Interface01 {
    public static void main(String [] args){
        Queen q= new Queen();
        q.moves();
    }


    
}

interface ChessPlayer{
    void moves();
}

class Pown implements ChessPlayer{
    public void moves(){
        System.out.println("Up, Dowm, left , right");
    }
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("left,right,up, down by one steps");
    }
}
