package practice2.accessmodifiers1;
import practice2.accessmodifier2.*;

public class A {
    
    protected String protectedMessage = "This message is protected";
    
    public static void main(String[] args) {
        
       B b = new B();
       System.out.println(b.privateMessage);


    }
   
}
