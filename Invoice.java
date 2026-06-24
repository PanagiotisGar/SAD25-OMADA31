import java.util.Date;

public class Invoice {
    private int invoiceId;
    private Date invoiceDate;
    private double totalAmount;
    private Order order;

    public Invoice(int invoiceId, Order order) {
        this.invoiceId = invoiceId;
        this.invoiceDate = new Date();
        this.order = order;
    
        this.totalAmount = order.getTotalAmount(); 
    }

    public void generateInvoice() {
        System.out.println("--- Τιμολόγιο #" + invoiceId + " ---");
        System.out.println("Ημερομηνία: " + invoiceDate);
        System.out.println("Πελάτης: " + order.getCustomer().getName());
        System.out.println("Συνολικό Ποσό: " + totalAmount + "€");
        System.out.println("---------------------------");
    }

    public void printData() {
        generateInvoice();
    }
}