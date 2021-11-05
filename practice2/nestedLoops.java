package practice2;

import java.util.Scanner;


public class nestedLoops {
    public static void main(String[] args) {
    // nested loops = a loop inside another loop

    Scanner scanner = new Scanner(System.in);
    int rows;
    int collums;
    String symbol = " ";

    System.out.println("Enter number of rows: ");
    rows = scanner.nextInt();
    System.out.println("Enter number of collums: ");
    collums = scanner.nextInt();
    System.out.println("Enter symbol to use: ");
    symbol = scanner.next();

    for (int i = 1; i <= rows; i++) {
        System.out.println();
        for (int j = 1; j <= collums; j++) {
            System.out.print(symbol);

        }
    }

    
    }
}
