public class Accountant extends Employee {

    public Accountant(String fullName, String role, String account_type) {
        super(fullName, role, account_type);
    }

    public void issueInvoice() {
        System.out.println("Executing issueInvoice() in Accountant class.");
    }

    public void processSupplierPayment() {
        System.out.println("Executing processSupplierPayment() in Accountant class.");
    }
}