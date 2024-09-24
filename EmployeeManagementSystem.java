import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] employeenames = new String[5]; // array for 5 employee names
        double[][] employeesalaries = new double[5][3]; // array for salary and allowances

        for (int i = 0; i < employeenames.length; i++) { // start from 0
            System.out.println("Enter Employee Name: "); // input name and salary
            employeenames[i] = scanner.nextLine();

            System.out.print("Enter Base Salary: ");
            employeesalaries[i][0] = scanner.nextDouble();

            System.out.print("Enter Health Allowance: ");
            employeesalaries[i][1] = scanner.nextDouble();

            System.out.print("Enter Transportation Allowance: ");
            employeesalaries[i][2] = scanner.nextDouble();
            scanner.nextLine(); // consume the newline
        }

        double[] employeeBonuses = new double[5];
        for (int i = 0; i < employeenames.length; i++) {
            double totalSalary = employeesalaries[i][0] + employeesalaries[i][1] + employeesalaries[i][2];
            employeeBonuses[i] = calculateBonus(totalSalary); // use total salary
        }

        System.out.println("Employee Summary: ");
        for (int i = 0; i < employeenames.length; i++) {
            System.out.println("*************");
            System.out.println("Name: " + employeenames[i]);
            System.out.println("Base Salary: " + employeesalaries[i][0]); // print specific base salary
            System.out.println("Total Salary: " + (employeesalaries[i][0] + employeesalaries[i][1] + employeesalaries[i][2])); // calculate total salary
            System.out.println("Bonus: " + employeeBonuses[i]); // print calculated bonus
            System.out.println("*************");
        
        }

        scanner.close();
    }

    public static double calculateBonus(double totalSalary) { // changed parameter to total salary
        double bonus = 0;
        if (totalSalary > 5000) {
            bonus = 0.1 * totalSalary;
        } else if (totalSalary > 3000) {
            bonus = 0.05 * totalSalary;
        }
        return bonus; // return calculated bonus
    }
}


    /*public static void main(String[] args) {
        SalaryManagement[] employees = new SalaryManagement[3]; // Array for 5 students
        Scanner scanner = new Scanner(System.in);

        // Collect data for each student
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Base Salary:  ");
            double baseSalary = scanner.nextDouble();

            employees[i] = new SalaryManagement(name, baseSalary); //pass to the get

            System.out.print("Health Allowance: ");
            double healthAllowance = scanner.nextDouble();
            employees[i].setHealthAllowance(healthAllowance);

            System.out.print("Transport Allowance: ");
            double transportAllowance = scanner.nextDouble();
            employees[i].setTransportAllowance(transportAllowance);
            scanner.nextLine();
            System.out.println();
            
        } */
    
    /* public class EmployeeManagementSystem {
        public static void main(String[] args) {
            Employee[] employees = new Employee[5]; // Array to store employees
            Scanner scanner = new Scanner(System.in);
    
       
            for (int i = 0; i < employees.length; i++) {
                System.out.print("Enter name of employee " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.print("Enter base salary of employee " + (i + 1) + ": ");
                double baseSalary = scanner.nextDouble();
                scanner.nextLine(); 
    
            }
            
            System.out.println("\nEmployee Details:");
            System.out.printf("%-20s %-15s %-15s %-15s %-15s%n", "Name", "Base Salary", "Bonus", "Total Salary", "Health Allowance");
            for (Employee employees : employees) {
                System.out.printf("%-20s %-15.2f %-15.2f %-15.2f %-15.2f%n",
                        employees.getName(), employees.getBaseSalary(), employees.getBonus(),
                        employees.calculateTotalSalary(), employees.getHealthAllowance());
            }
    
            scanner.close();
        }
    }
    */



    
