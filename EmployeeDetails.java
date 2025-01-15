//Write a Java program to take Employee id,name,address & salary from user and display on to screen.


package emp_details;
import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        //  employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Employee Address: ");
        String empAddress = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();

        // Display the employee details
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Address: " + empAddress);
        System.out.println("Employee Salary: " + empSalary);

        // Close the scanner
        scanner.close();
    }
}
