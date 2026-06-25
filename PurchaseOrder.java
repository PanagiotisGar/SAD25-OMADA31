import java.util.ArrayList;
import java.util.List;

public class PurchaseOrder {

    private static int nextId = 1;

    private int purchaseOrderId;
    private Supplier supplier;
    private List<PurchaseOrderLine> lines;
    private String reason;
    private String status;

    public PurchaseOrder(Product product, int quantity) {
        this(null, product, quantity,
                "Stock fell below the safety limit", "Created");
    }

    public PurchaseOrder(Supplier supplier, Product product, int quantity) {
        this(supplier, product, quantity,
                "Stock fell below the safety limit", "Created");
    }

    public PurchaseOrder(Supplier supplier, Product product, int quantity,
                         String reason, String status) {
        this.purchaseOrderId = nextId++;
        this.supplier = supplier;
        this.lines = new ArrayList<>();
        this.reason = reason;
        this.status = status;
        addLine(product, quantity);
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getReason() {
        return reason;
    }

    public String getStatus() {
        return status;
    }

    public List<PurchaseOrderLine> getLines() {
        return lines;
    }

    public void addLine(Product product, int quantity) {
        lines.add(new PurchaseOrderLine(product, quantity));
    }

    public double getTotalCost() {
        double total = 0;
        for (PurchaseOrderLine line : lines) {
            total += line.getLineCost();
        }
        return total;
    }

    public void printData() {
        System.out.println("Purchase Order ID: " + purchaseOrderId);
        if (supplier != null) {
            System.out.println("Supplier: " + supplier.getSupplierName());
        } else {
            System.out.println("Supplier: Not selected yet");
        }
        System.out.println("Status: " + status);
        System.out.println("Reason: " + reason);
        System.out.println("Products ordered:");

        for (PurchaseOrderLine line : lines) {
            System.out.println("- Product: " + line.getProduct().getName() +
                    ", Quantity: " + line.getQuantity());
        }

        System.out.println("Total estimated cost: " + getTotalCost());
    }
}
