package practice.modems;

public class dslModem extends modem {
    String method = "DSL phone connection";

    public void connect() {
        System.out.println("Connecting to the internet ...");
        System.out.println("Using a " + method);
    }
}
