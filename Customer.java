public class Customer {

    private String name;
    private String customerType;
    private String afm;
    private String doy;
    private String status;

    public Customer(String name, String customerType, String afm, String doy, String status) {

        this.name = name;
        this.customerType = customerType;
        this.afm = afm;
        this.doy = doy;
        this.status = status;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public String getAfm() {
        return afm;
    }

    public String getDoy() {
        return doy;
    }

    public String getStatus() {
        return status;
    }

    public void printData() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Type: " + customerType);
        System.out.println("AFM: " + afm);
        System.out.println("DOY: " + doy);
        System.out.println("Status: " + status);
    }
}