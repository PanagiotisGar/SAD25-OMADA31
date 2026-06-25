public class RetailCustomer extends Customer {

    public RetailCustomer(String name, String customerType, String afm, String doy, String status) {
        super(name, customerType, afm, doy, status);
    }

    public double makeRetailPurchase(double[] prices, int[] quantities) {

        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            total += prices[i] * quantities[i];
        }

        System.out.println("Purchase Total: " + total);

        return total;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Customer Type: Retail Customer");
    }
}
