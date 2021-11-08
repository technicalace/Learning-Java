package practice2.accessmodifiers1;
import practice2.accessmodifier2.*;

public class B {
    
    private String privateMessage = "This is privite";

    public static void main(String[] args)  {
        System.out.println(privateMessage);
    }
}
