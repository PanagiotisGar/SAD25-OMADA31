public class Cashier extends Employee {

    public Cashier(String fullName, String role, String account_type) {
        super(fullName, role, account_type);
    }

    public void processRetailSale() {
        System.out.println("Executing processRetailSale() in Cashier class.");
    }

    public void issueReceipt() {
        System.out.println("Executing issueReceipt() in Cashier class.");
    }
}
