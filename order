import java.util.ArrayList;
import java.util.Date;
import java.util.List;

enum OrderStatus {
    PENDING, CONFIRMED, CANCELLED
}

public class Order {
    private int orderId;
    private Date orderDate;
    private OrderStatus status;
    private double totalAmount;
    private Customer customer;
    private Employee employee;
    private String type;
    
    // Χρήση List<OrderLine> σύμφωνα με το διάγραμμα
    private List<OrderLine> items = new ArrayList<>();

    public Order(int orderId, Customer customer, Employee employee, String type) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.type = type;
        this.orderDate = new Date();
        this.status = OrderStatus.PENDING;
    }

    // Επικοινωνία με την κλάση OrderLine για την προσθήκη προϊόντων στην παραγγελία
    public void addItem(Product product, int quantity) {
        OrderLine line = new OrderLine(product, quantity);
        items.add(line);
        calculateTotal();
    }

    public void calculateTotal() {
        double total = 0;
        for (OrderLine line : items) {
            total += line.calculateSubtotal();
        }
        this.totalAmount = total;
    }

    public void confirmOrder() {
        this.status = OrderStatus.CONFIRMED;
    }

    // --- Getters ---

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getType() {
        return type;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<OrderLine> getItems() {
        return items;
    }

    // --------------------------------------------------------------

    public void printData() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customer.getName() + 
                           " | Total: " + totalAmount + "€ | Status: " + status);
    }
}