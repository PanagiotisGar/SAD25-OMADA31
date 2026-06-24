public class Manager extends Employee {

    public Manager(String fullName, String role, String account_type) {
        super(fullName, role, account_type);
    }

    public void generateReports() {
        System.out.println("Executing generateReports() in Manager class.");
    }

    public void manageUsers() {
        System.out.println("Executing manageUsers() in Manager class.");
    }
}