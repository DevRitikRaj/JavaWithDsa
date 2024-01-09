package Oops;

public class Access {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.username="Ritik";
        b.setpassword("abcd");
        System.out.println(b.username);
        
        // System.out.println(b.setpassword());
        


       
    }
}

class BankAccount {
    public String username;
    private String password;

     public void setpassword(String pwd){
        password=pwd;
    }

}
    

   
    

