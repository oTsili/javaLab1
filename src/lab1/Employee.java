package lab1;

public class Employee {
    private int employeeID;

    private String firstName;
    private String lastName;
    private double baseSalary;
    private int yearsOfService;
    private double bonus;

    @Override
    public String toString() {
        return "lab1.Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", baseSalary=" + baseSalary +
                ", yearsOfService=" + yearsOfService +
                ", bonus=" + bonus +
                '}';
    }

    public Employee(int employeeID, String firstName, String lastName, double baseSalary, int yearsOfService, double bonus) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
        this.yearsOfService = yearsOfService;
        this.bonus = bonus;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double salary(){
        return baseSalary + yearsOfService * 10 + bonus;
    }
}
