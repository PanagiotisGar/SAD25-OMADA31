public class Supplier {

    private String supplierName;
    private String phone;
    private String email;

    public Supplier(String supplierName, String phone, String email) {
        this.supplierName = supplierName;
        this.phone = phone;
        this.email = email;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void printData() {
        System.out.println(
                "Supplier: " + supplierName +
                ", Phone: " + phone +
                ", Email: " + email
        );
    }
}