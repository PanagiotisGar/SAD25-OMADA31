import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {
    // Δημιουργία των καταλόγων
    List<Product> productCatalog = new ArrayList<>();
    List<Customer> customerCatalog = new ArrayList<>();
    List<Employee> employeeCatalog = new ArrayList<>();
    List<Order> orderCatalog = new ArrayList<>();
    List<SupplierOrder> supplierOrderCatalog = new ArrayList<>();

    System.out.println("=== ΕΝΑΡΞΗ ΑΡΧΙΚΟΠΟΙΗΣΗΣ ΔΕΔΟΜΕΝΩΝ ===\n");

    //1. ΔΗΜΙΟΥΡΓΙΑ ΠΡΟΪΟΝΤΩΝ
    Product product1 = new Product("Thermometer", "paramedical", 12.50, 80, 30);
    productCatalog.add(product1);
    System.out.println("Object product1 (\"Thermometer\") has been created and added to catalog.");

    Product product2 = new Product("Shoes", "paramedical", 35.00, 45, 20);
    productCatalog.add(product2);
    System.out.println("Object product2 (\"Shoes\") has been created and added to catalog.");

    Product product3 = new Product("Cream", "cosmetic", 18.00, 25, 40);
    productCatalog.add(product3);
    System.out.println("Object product3 (\"Cream\") has been created and added to catalog.");

    Product product4 = new Product("makeup", "cosmetic", 22.00, 60, 25);
    productCatalog.add(product4);
    System.out.println("Object product4 (\"makeup\") has been created and added to catalog.");


    //2. ΔΗΜΙΟΥΡΓΙΑ ΠΕΛΑΤΩΝ
    Customer customer1 = new Customer("Farmakeio Papadopoulou", "Pharmacy", "099845210", "DOY Kalamarias", "OK");
    customerCatalog.add(customer1);
    System.out.println("Object customer1 (\"Farmakeio Papadopoulou\") has been created and added to catalog.");

    Customer customer2 = new Customer("Farmakeio Nikolaidis", "Pharmacy", "078632145", "DOY Evosmou", "OK");
    customerCatalog.add(customer2);
    System.out.println("Object customer2 (\"Farmakeio Nikolaidis\") has been created and added to catalog.");

    Customer customer3 = new Customer("Georgiou Maria", "Retail", "112233445", "DOY Thessalonikis", "OK");
    customerCatalog.add(customer3);
    System.out.println("Object customer3 (\"Georgiou Maria\") has been created and added to catalog.");


    //3. ΔΗΜΙΟΥΡΓΙΑ ΥΠΑΛΛΗΛΩΝ
    Employee employee1 = new Employee("Antoniou", "Warehouse", "warehouse_user");
    employeeCatalog.add(employee1);
    System.out.println("Object employee1 (\"Antoniou\") has been created and added to catalog.");

    Employee employee2 = new Employee("Eleftheriou", "Customer Service", "service_user");
    employeeCatalog.add(employee2);
    System.out.println("Object employee2 (\"Eleftheriou\") has been created and added to catalog.");

    Employee employee3 = new Employee("Sotiriou", "Cashier", "cashier_user");
    employeeCatalog.add(employee3);
    System.out.println("Object employee3 (\"Sotiriou\") has been created and added to catalog.");

    Employee employee4 = new Employee("Seller1", "Sales", "sales_user");
    employeeCatalog.add(employee4);
    System.out.println("Object employee4 (\"Seller1\") has been created and added to catalog.");


    System.out.println("\n=== ΚΑΤΑΧΩΡΗΣΗ ΠΑΡΑΓΓΕΛΙΩΝ ===\n");

    //4. ΔΗΜΙΟΥΡΓΙΑ ΠΑΡΑΓΓΕΛΙΩΝ & ΜΕΙΩΣΗ ΑΠΟΘΕΜΑΤΟΣ
    
    // order1: customer1, employee4, Τιμολόγιο
    Order order1 = new Order(1,customer1, employee4, "Invoice");
    order1.addItem(product1, 10);
    product1.reduceStock(10);
    order1.addItem(product3, 5);
    product3.reduceStock(5); 
    orderCatalog.add(order1);
    System.out.println("Object order1 for customer1 executed by employee4 (Invoice) has been created.");

    // order2: customer1, employee4, Τιμολόγιο
    Order order2 = new Order(2, customer1, employee4, "Invoice");
    order2.addItem(product2, 8);
    product2.reduceStock(8); 
    order2.addItem(product4, 12);
    product4.reduceStock(12); 
    orderCatalog.add(order2);
    System.out.println("Object order2 for customer1 executed by employee4 (Invoice) has been created.");

    // order3: customer2, employee4, Τιμολόγιο
    Order order3 = new Order(3, customer2, employee4, "Invoice");
    order3.addItem(product3, 20);
    product3.reduceStock(20); 
    order3.addItem(product4, 10);
    product4.reduceStock(10);
    order3.addItem(product1, 6);
    product1.reduceStock(6);  
    orderCatalog.add(order3);
    System.out.println("Object order3 for customer2 executed by employee4 (Invoice) has been created.");

    // order4: customer3, employee3, Απόδειξη
    Order order4 = new Order(4, customer3, employee3, "Receipt");
    order4.addItem(product1, 1);
    product1.reduceStock(1);  
    order4.addItem(product4, 2);
    product4.reduceStock(2); 
    orderCatalog.add(order4);
    System.out.println("Object order4 for customer3 executed by employee3 (Receipt) has been created.");


    System.out.println("\n=== ΑΚΥΡΩΣΗ ΠΑΡΑΓΓΕΛΙΑΣ (order2) ===\n");

    //5. ΔΙΑΓΡΑΦΗ/ΑΚΥΡΩΣΗ ΤΗΣ order2
    product2.increaseStock(8);
    product4.increaseStock(12);
    orderCatalog.remove(order2);
    System.out.println("Object order2 has been deleted (canceled) successfully. Stock restored.");


    System.out.println("\n=== ΕΛΕΓΧΟΣ ΑΠΟΘΕΜΑΤΩΝ & ΑΝΑΠΛΗΡΩΣΗ ===\n");

    //6. ΕΛΕΓΧΟΣ ΑΠΟΘΕΜΑΤΩΝ (Automated Supplier Order)
    for (Product prod : productCatalog) {
        if (prod.getAvailableStock() < prod.getSafetyLimit()) {
            System.out.println("Alert: Product \"" + prod.getName() + "\" is below safety limit! (Current: " 
                               + prod.getAvailableStock() + " < Limit: " + prod.getSafetyLimit() + ")");
            
            // Παράδειγμα αυτοματοποιημένης παραγγελίας για το product3
            if (prod.getName().equalsIgnoreCase("Cream")) {
                SupplierOrder supplierOrder1 = new SupplierOrder(prod, 50);
                supplierOrderCatalog.add(supplierOrder1);
                System.out.println("SupplierOrder1 automatically created for product3 (\"" + prod.getName() + "\") with 50 units.");
            } else {
                // Γενικός χειρισμός για άλλα προϊόντα αν χρειαστεί
                SupplierOrder autoSupplierOrder = new SupplierOrder(prod, 50);
                supplierOrderCatalog.add(autoSupplierOrder);
                System.out.println("Supplier Order automatically created for \"" + prod.getName() + "\".");
            }
        }
    }
    System.out.println("\n=== ΕΚΤΥΠΩΣΗ ΔΕΔΟΜΕΝΩΝ ΚΑΤΑΛΟΓΩΝ (printData) ===\n");

    //7.ΕΚΤΥΠΩΣΗ ΚΑΤΑΛΟΓΩΝ (printData)
    //Εκτύπωση Καταλόγου Προϊόντων
    System.out.println("--- Κατάλογος Προϊόντων ---");
    for (Product prod : productCatalog) {
        prod.printData();
    }

    //Εκτύπωση Καταλόγου Πελατών
    System.out.println("\n--- Κατάλογος Πελατών ---");
    for (Customer cust : customerCatalog) {
        cust.printData();
    }

    //Εκτύπωση Καταλόγου Υπαλλήλων
    System.out.println("\n--- Κατάλογος Υπαλλήλων ---");
    for (Employee emp : employeeCatalog) {
        emp.printData();
    }

    //Εκτύπωση Καταλόγου Παραγγελιών
    System.out.println("\n--- Κατάλογος Παραγγελιών ---");
    for (Order ord : orderCatalog) {
        ord.printData();
    }

    //Εκτύπωση Καταλόγου Παραγγελιών Προμηθευτή
    System.out.println("\n--- Κατάλογος Παραγγελιών Προμηθευτή ---");
    for (SupplierOrder supOrd : supplierOrderCatalog) {
        supOrd.printData();
    }
    
    System.out.println("\n=== ΤΕΛΟΣ ΕΚΤΕΛΕΣΗΣ ΠΡΟΓΡΑΜΜΑΤΟΣ ===");
}