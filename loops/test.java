package loops;
import java.util.Scanner;

import javax.sound.midi.Synthesizer;
import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class test {
    public static void main(String[] args) {

        /*for (int i = 1; i < 10; i++) {

            System.out.println(i);
        }*/

        /*int sum = 0;
        for (int i = 1; i <= 10; i++) 
        {    
            sum += i;
        }
        System.out.println("Sum: " +sum);
        */

        /*Scanner scn = new Scanner(System.in);
        int num; 

        System.out.println("Please enter a positive integer: ");
        num = scn.nextInt(); 

        for (int i = 1; i <= 10; i++) {

            System.out.println(num + " x " + i + " = " + (num*i));
        }
        */

        /*Scanner scn = new Scanner(System.in);
        int num; 

        System.out.println("Please input a positive integer: ");
        num = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " + " + i + " = " + (num+i));
        } 
        */

        /*Scanner scn = new Scanner(System.in);
        double sum; 

        System.out.println("Please enter a positive intiger: ");
        sum = scn.nextDouble(); 

        for (double i = 1; i <= 10; i++) {
            System.out.println(sum + " / " + i + " = " + (sum/i));
        }*/

        /*Scanner scn = new Scanner(System.in); 
        int num; 
        int fact = 1;

        System.out.println("Enter a any number from keyboard: ");
        num = scn.nextInt();

        for (int i = 1; i <= num; i++) {

            fact *= i;

        }
        System.out.println("Factorial: " + fact);
        */

        /*Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        int base;
        int power; 
        int result = 1;

        System.out.println("Please enter your first number: ");
        base = scn.nextInt();
        System.out.println("Please enter your second number: ");
        power = scn2.nextInt();

        for (int i = 1; i <= power; i++) {
            
            result *= base;

        }

        System.out.println("Result: " + result);
        */

        /*Scanner scn = new Scanner(System.in);
        int input; 
        int reversedValue = 0;

        System.out.println("Enter a number of integers: ");
        input = scn.nextInt(); 

        int temp = input; 
        int remainder = 1;

        System.out.println(input+ "\n----------");

        while (temp > 0) {
            remainder = temp % 10;
            reversedValue = reversedValue * 10 + remainder;
            temp /= 10;
        }
        System.out.println("Reverse of " + input + " is " + reversedValue);
        */

        /*Scanner scn = new Scanner(System.in); 
        
        int number; 
        char choice; 
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter your number: ");
            number = scn.nextInt(); 

            if (number % 2 == 0 ) {
                evenSum += number;
            }
            else {
                oddSum += number;
            }
            System.out.println("Would you like to continue? ");
            choice = scn.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        */

        // DAY 2

        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/

        /*int sum = 0; 

        for (int i = 0; i <= 10; i++) {
            sum += i; 

        }
        System.out.println("Sum: " +sum);
        */

        /*int sum = 8; 
        
        for (int i = 0; i <= 10; i++) {
            sum += i; 
        }
        System.out.println("Sum: " +sum);
    */

        /*Scanner scn = new Scanner(System.in); 
        int sum = 0; 

        for (int i = 0; i <= 10; i++) {
            System.out.println("Enter a number: ");
            sum = scn.nextInt(); 
        }
        System.out.println("Sum is " +sum);
        */

        /*
        int length = 5; 
        int breadth = 7; 

        System.out.println("The area of the rectangle is " + (length*breadth));
        System.out.println("The parameter is " +(2*(length*breadth)));
        */

        double x = 10.0; 
        x %= 6.0;
        System.out.println(x);
    }


}
