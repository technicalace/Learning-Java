package practice2;

import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        // while loop = executes a block of code as long as a it's condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = " ";


        // while loop
        /*while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello "+name);*/


        // do while loop
        do {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }while (name.isBlank());

        System.out.println("Hello "+name);
    }
    
}
