public class Product {

    private String name;
    private String category;
    private double price;
    private int availableStock;
    private int safetyLimit;

    public Product(String name, String category, double price,
                   int availableStock, int safetyLimit) {

        this.name = name;
        this.category = category;
        this.price = price;
        this.availableStock = availableStock;
        this.safetyLimit = safetyLimit;
    }

    public String getName() {
        return name;
    }

    public int getAvailableStock() {
        return availableStock;
    }

    public int getSafetyLimit() {
        return safetyLimit;
    }

    public double getPrice() {
        return price;
    }

    public void reduceStock(int quantity) {
        if (quantity <= availableStock) {
            availableStock -= quantity;
        } else {
            System.out.println("Not enough stock for product: " + name);
        }
    }

    public void increaseStock(int quantity) {
        availableStock += quantity;
    }

    public void printData() {
        System.out.println(
                "Product: " + name +
                ", Category: " + category +
                ", Price: " + price +
                ", Stock: " + availableStock +
                ", Safety Limit: " + safetyLimit
        );
    }
}