package practice2.objectpassing;

public class main {
    public static void main(String[] args) {
        garage grg = new garage();

        car cr = new car("BMW");
        car cr2 = new car("Tesla");

        grg.park(cr);
        grg.park(cr2);
    }
}
