package practice2.exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exception = an event that occurs during the execution of a program that,
        //             disructs the nromal flow of instructions 

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Etner a whole number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Etner a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y; 

            System.out.println("Result: " + z);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by 0 idiot");
        }
        catch (InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER OMFG");
        }
        finally {
            scanner.close();
        }
    }
}
