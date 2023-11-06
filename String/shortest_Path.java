package String;

import java.util.Scanner;

public class shortest_Path {
    public static float getshortest(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            // -----------Direction------------
            if(dir=='N'){
                y++;

            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=(x*x);
        int y2=(y*y);
        return (float)Math.sqrt(x2+y2);
    }

    public static void main(String [] ar){
        Scanner sc=new Scanner(System.in);
        String path;
        System.out.println("Enter the path");
        path=sc.nextLine();
         System.out.println(getshortest(path));
        
       
    }
    
    
}
