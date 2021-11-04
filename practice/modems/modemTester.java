package practice.modems;

public class modemTester {
    public static void main(String[] arguements) {
        cableModem surfBoard = new cableModem();
        dslModem gateWay = new dslModem();
        surfBoard.speed = 500000;
        gateWay.speed = 400000;
        System.out.println("Trying the cable mondem: ");
        surfBoard.connect();
        System.out.println("Trying the DSL modem");
        gateWay.displaySpeed();
        gateWay.connect();
    }
}
