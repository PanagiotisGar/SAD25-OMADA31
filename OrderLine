public class OrderLine {
    private Product product;
    private int quantity;
    private double unitPrice;

    public OrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = product.getPrice(); // Παίρνουμε την τιμή τη στιγμή της αγοράς
    }

    public double calculateSubtotal() {
        return this.quantity * this.unitPrice;
    }

    // Getters
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public double getUnitPrice() { return unitPrice; }
}