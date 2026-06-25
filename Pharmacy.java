public class Pharmacy extends Customer {

    private String vatNumber;
    private double wholesaleDiscount;

    public Pharmacy(String name, String customerType, String afm, String doy, String status, String vatNumber, double wholesaleDiscount) {

        super(name, customerType, afm, doy, status);

        this.vatNumber = vatNumber;
        this.wholesaleDiscount = wholesaleDiscount;
    }

    public double placeWholesaleOrder(double amount) {

        double discountAmount = amount * wholesaleDiscount;
        double finalAmount = amount - discountAmount;

        System.out.println("Initial Amount: " + amount);
        System.out.println("Discount: " + discountAmount);
        System.out.println("Final Amount: " + finalAmount);

        return finalAmount;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public double getWholesaleDiscount() {
        return wholesaleDiscount;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println(
                "VAT Number: " + vatNumber +
                        " | Wholesale Discount: " + wholesaleDiscount
        );
    }
}
