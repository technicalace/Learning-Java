package practice2.polymorphism;
public class Main {
    public static void main(String[] args) {    
    // polymorphism = greek word for poly = "many", morph -"form"
    //                the ability of an object to identify as more than one type

    Car car = new Car();
    Bicicle bike = new Bicicle();
    Boat boat = new Boat();

    Vehicle[] racers = {car, bike, boat};   

    for (Vehicle x : racers) {
        x.go();
    }
    } 
}
