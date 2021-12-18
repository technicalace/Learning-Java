package projects.shopping;

public class shopcart {
    public static void main(String[] args) {
        shopitems groItems = new shopitems(); 
        groItems.setStoreName("Walmart");
        groItems.setAmount(12);

        System.out.println("Hello, I am shopping at " + groItems.getStoreName());
        System.out.println("There are" + groItems.getAmount() + " different items.");
    }
}
