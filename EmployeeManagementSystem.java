import java.io.*;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String toFileString() {
        return id + "," + name + "," + designation + "," + salary;
    }

    public static Employee fromFileString(String line) {
        String[] data = line.split(",");
        return new Employee(Integer.parseInt(data[0]), data[1], data[2], Double.parseDouble(data[3]));
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

public class EmployeeManagementSystem {
    private static final String FILE_NAME = "employees.txt";
    private static final Scanner scanner = new Scanner(System.in);

    public static void addEmployee() {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            System.out.print("Enter Employee ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Employee Designation: ");
            String designation = scanner.nextLine();

            System.out.print("Enter Employee Salary: ");
            double salary = scanner.nextDouble();

            Employee employee = new Employee(id, name, designation, salary);
            pw.println(employee.toFileString());

            System.out.println("Employee added successfully!\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void displayEmployees() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean hasData = false;
            while ((line = br.readLine()) != null) {
                Employee emp = Employee.fromFileString(line);
                emp.display();
                hasData = true;
            }
            if (!hasData) {
                System.out.println("No employees found.\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println("No employee records found. Add employees first.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
