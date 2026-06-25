import java.util.Date;

public class Employee extends User {
    private String employeeCode;
    private Date hireDate;

    
    public Employee(String fullName, String role, String account_type) {
        super(fullName, role, account_type);
        this.employeeCode = "EMP-" + fullName.substring(0, Math.min(3, fullName.length())).toUpperCase();
        this.hireDate = new Date();
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void viewProducts() {
        System.out.println("Executing viewProducts() in Employee class.");
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("   └─ Employee Code: " + employeeCode + " | Hire Date: " + hireDate);
    }
}
