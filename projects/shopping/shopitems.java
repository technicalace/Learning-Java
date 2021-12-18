package projects.shopping;

public class shopitems {
    
    public static String[] itemname = {"Bannana", "Apple", "Onion"};
    private static String storeName;
    private static int amount;

    public void setStoreName(String name) {
        this.storeName = name;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setAmount(int number) {
        this.amount = number;
    }

    public int getAmount() {
        return amount;
    }
}
