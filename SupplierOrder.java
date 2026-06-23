public class SupplierOrder {

    private Product product;
    private int quantity;

    public SupplierOrder(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printData() {
        System.out.println(
                "Supplier Order -> Product: " +
                product.getName() +
                ", Quantity: " +
                quantity
        );
    }
}