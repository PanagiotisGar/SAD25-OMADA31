public class PurchaseOrderLine {

    private Product product;
    private int quantity;

    public PurchaseOrderLine(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getLineCost() {
        return product.getPrice() * quantity;
    }

    public void printData() {
        System.out.println(
                "Product: " + product.getName() +
                ", Quantity: " + quantity +
                ", Estimated Cost: " + getLineCost()
        );
    }
}
