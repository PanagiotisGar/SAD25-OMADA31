public class WarehouseEmployee extends Employee {

    public WarehouseEmployee(String fullName, String role, String account_type) {
        super(fullName, role, account_type);
    }

    public void updateStock() {
        System.out.println("Executing updateStock() in WarehouseEmployee class.");
    }

    public void receiveProducts() {
        System.out.println("Executing receiveProducts() in WarehouseEmployee class.");
    }

    public void setSafetyStock() {
        System.out.println("Executing setSafetyStock() in WarehouseEmployee class.");
    }
}