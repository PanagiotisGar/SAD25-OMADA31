public class CustomerServiceEmployee extends Employee {

    public CustomerServiceEmployee(String fullName, String role, String account_type) {
        super(fullName, role, account_type);
    }

    public void answerCustomerInquiry() {
        System.out.println("Executing answerCustomerInquiry() in CustomerServiceEmployee class.");
    }

    public void checkAvailability() {
        System.out.println("Executing checkAvailability() in CustomerServiceEmployee class.");
    }
}