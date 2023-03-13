public class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private int employeeID;
    
    // constructor
    public Employee(String name, String address, String phoneNumber, int employeeID) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.employeeID = employeeID;
    }
    
    // getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public int getEmployeeID() {
        return employeeID;
    }
    
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
