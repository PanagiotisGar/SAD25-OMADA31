public class Customer {

    protected int customerId;
    protected String name;
    protected String phone;
    protected String address;

    public Customer(int customerId, String name, String phone, String address) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    // Getters

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void printData() {
        System.out.println(
                "Customer ID: " + customerId +
                        " | Name: " + name +
                        " | Phone: " + phone +
                        " | Address: " + address
        );
    }
}