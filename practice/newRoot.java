package practice;

public class newRoot {
    public static void main(String[] arguements) {
        int number = 100;
        if (arguements.length > 0) {
            number = Integer.parseInt(arguements[0]);
        }
        System.out.println("The square root of " + number + " is " + Math.sqrt(number));
    }
}
