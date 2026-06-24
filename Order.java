import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
    private Map<Product, Integer> items = new HashMap<>();

    public Order(int orderId, Customer customer, Employee employee, String type) {
        this.orderId = orderId;
        this.customer = customer;
        this.employee = employee;
        this.type = type;
        this.orderDate = new Date();
        this.status = OrderStatus.PENDING;
    }

    public void addItem(Product product, int quantity) {
        items.put(product, quantity);
        calculateTotal();
    }

    public void calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : items.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        this.totalAmount = total;
    }

    public void confirmOrder() {
        this.status = OrderStatus.CONFIRMED;
    }

    public void printData() {
        System.out.println("Order ID: " + orderId + " | Customer: " + customer.getName() + " | Total: " + totalAmount + " | Status: " + status);
    }
}