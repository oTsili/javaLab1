public class TestEmployee {
    public static void main(String[] args) {
//        Employee employee1 = new Employee(123,"Ioannis", "Papadopoulos",800.00, 4,200.00);
//        Employee employee2 = new Employee(456,"George", "Kakouros",700.00, 3,150.00);
//

        Employee employee1 = createEmployee();
        Employee employee2 = createEmployee();

        System.out.println(employee1);
        System.out.println(employee2);

        findLowSalary(employee1, employee2);

    }
        public static Employee createEmployee() {
            int employeeId = UserInput.getInteger("Enter employee ID");
            String firstName = UserInput.getString("Enter first name");
            String lastName = UserInput.getString("Enter last name");
            double baseSalary = UserInput.getDouble("Enter base salary");
            int yearsOfService = UserInput.getInteger("Enter years of service");
            double bonus = UserInput.getDouble("Enter bonus");
            System.out.println(" "+ baseSalary + " " +bonus);

            return new Employee(employeeId, firstName, lastName, baseSalary, yearsOfService, bonus);
        }

        public static void findLowSalary(Employee employee1, Employee employee2){
            Employee[] employees = {employee1,employee2};

            for( Employee employee: employees){
               if (employee.getBaseSalary() < 1200 && employee.getYearsOfService() >= 5){
                   System.out.println("Employee " + employee.getLastName() + " is low wage!");
                   employee.setBaseSalary(employee.getBaseSalary() + 100);
                   System.out.println("Employee " + employee.getLastName() + " has now got a promotion and his new salary is " + employee.salary());
                   System.out.println(employee);
               }
            }
        }

}
