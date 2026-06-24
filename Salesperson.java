public class Salesperson extends Employee {

    public Salesperson(String fullName, String role, String account_type) {
        super(fullName, role, account_type);
    }

    public void createOrder() {
        System.out.println("Executing createOrder() in Salesperson class.");
    }

    public void submitOrder() {
        System.out.println("Executing submitOrder() in Salesperson class.");
    }
}