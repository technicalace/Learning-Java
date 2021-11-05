package practice2.oop;

public class main {
    public static void main(String[] args) {
        // object = an instance of a class that may contain attributes and methods
        // example (phone, desk, computer, coffee cup)
        
        car myCar1 = new car();
        car myCar2 = new car();

        System.out.println(myCar2.make);
        System.out.println(myCar2.model);
        System.out.println(myCar1.make);
        System.out.println(myCar1.model);

        //myCar1.drive();
        //myCar1.brake();
    }
}
