package practice2.abstraction;

public class Main {
    public static void main(String[] args) {

        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        //           abstract methods are declared without an implentation

        //Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.go();
    }
}
