package lab2;

import lab1.Employee;
import lab1.UserInput;

public class TestEmployee {

    public static void main(String[] args) {
        // Read the size of the array
        int employeeSize = UserInput.getInteger("Enter the number of Employees");

        // create the array
        Employee[] staff = new Employee[employeeSize];
        for (int i = 0; i < staff.length; i++) {
            staff[i] = createEmployee();
        }
        // Display the staff
        displayStaff(staff);



    }

    public static Employee createEmployee() {
        int employeeId = UserInput.getInteger("Enter employee ID");
        String firstName = UserInput.getString("Enter first name");
        String lastName = UserInput.getString("Enter last name");
        double baseSalary = UserInput.getDouble("Enter base salary");
        int yearsOfService = UserInput.getInteger("Enter years of service");
        double bonus = UserInput.getDouble("Enter bonus");
        System.out.println(" " + baseSalary + " " + bonus);

        return new Employee(employeeId, firstName, lastName, baseSalary, yearsOfService, bonus);
    }

    public static void findLowSalary(Employee employee1, Employee employee2) {
        Employee[] employees = {employee1, employee2};

        for (Employee employee : employees) {
            if (employee.getBaseSalary() < 1200 && employee.getYearsOfService() >= 5) {
                System.out.println("lab1.Employee " + employee.getLastName() + " is low wage!");
                employee.setBaseSalary(employee.getBaseSalary() + 100);
                System.out.println("lab1.Employee " + employee.getLastName() + " has now got a promotion and his new salary is " + employee.salary());
                System.out.println(employee);
            }
        }
    }

    public static void displayStaff(Employee[] staff) {
        for (Employee employee : staff) {
            System.out.println(employee);
            System.out.println("Salary is: " + employee.salary());
        }
    }

}
