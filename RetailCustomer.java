public class RetailCustomer extends Customer {

    public RetailCustomer(int customerId, String name, String phone, String address) {
        super(customerId, name, phone, address);
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
