public class Customer {
    private static int customerCount = 0;
    private final int customerNumber;
    private String name;
    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
        this.customerNumber = ++customerCount;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
}