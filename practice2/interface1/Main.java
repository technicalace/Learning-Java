package practice2.interface1;

public class Main {
    public static void main(String[] args) {
        // interface = a template that can be applied to a class.
        //             simular to inheritance, but specifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limited to 1 super class
        
        Fish fish = new Fish();

        fish.flee();
        fish.hunt();

    }
}
