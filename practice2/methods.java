package practice2;

public class methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        String name = "Aj";
        int age = 16;
        hello(name,age);

    }

    static void hello(String name, int age) {
        System.out.println("Hello "+name + "." + " I am "+age+" years old.");
    }

}
