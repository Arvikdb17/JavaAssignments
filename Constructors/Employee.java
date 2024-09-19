package Constructors;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private String employeeID;
    private String email;
    private double salary;
    private static int employeeCount = 0;

    public Employee(String firstName, String lastName, String employeeID, String email, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.email = email;
        this.salary = salary;
        employeeCount++;
    }


    public static int getEmployeeCount() {
        return employeeCount;
    }

    @Override
    public String toString() {
        return "EmployeeDTO [First Name=" + firstName + ", Last Name=" + lastName + ", Employee ID=" + employeeID +
                ", Email=" + email + ", Salary=" + salary + "]";
    }

    public static void addAndDisplayEmployees() {
        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Aravind", "Kumar", "E123", "ak@example.com", 75000.00));
        employees.add(new Employee("Naveen", "Kumar", "E124", "nk@example.com", 80000.00));
        employees.add(new Employee("Rohit", "Raj", "E125", "rr@example.com", 70000.00));
        display(employees);
    }
    public static void display(List<Employee> employees){

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("Total number of employees created: " + Employee.getEmployeeCount());
    }

    public static void main(String[] args) {

        addAndDisplayEmployees();
    }
}
