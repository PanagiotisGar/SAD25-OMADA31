import java.util.Date;

public class Receipt {
    private int receiptId;
    private Date receiptDate;
    private double totalAmount;
    private Order order;

    public Receipt(int receiptId, Order order) {
        this.receiptId = receiptId;
        this.receiptDate = new Date();
        this.order = order;
        this.totalAmount = order.getTotalAmount();
    }

    public void generateReceipt() {
        System.out.println("--- Απόδειξη Λιανικής #" + receiptId + " ---");
        System.out.println("Ημερομηνία: " + receiptDate);
        System.out.println("Πελάτης: " + order.getCustomer().getName());
        System.out.println("Συνολικό Ποσό: " + totalAmount + "€");
        System.out.println("----------------------------------");
    }
}