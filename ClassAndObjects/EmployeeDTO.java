package ClassAndObjects;

public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String employeeID;
    private String email;
    private double salary;
    private static int employeeCount = 0;


    private String socialSecurityNumber;
    private String phoneNumber;


    public EmployeeDTO(String firstName, String lastName, String employeeID, String email, double salary, String socialSecurityNumber, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.email = email;
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = phoneNumber;
        employeeCount++;
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

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getMaskedSocialSecurityNumber() {
        return "XXX-XX-" + socialSecurityNumber.substring(socialSecurityNumber.length() - 4);
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getMaskedPhoneNumber() {
        return phoneNumber.substring(0, 2) + "XXXXXX" + phoneNumber.substring(phoneNumber.length() - 2);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public static int getEmployeeCount() {
        return employeeCount;
    }


    @Override
    public String toString() {
        return "EmployeeDTO [First Name=" + firstName + ", Last Name=" + lastName + ", Employee ID=" + employeeID +
                ", Email=" + email + ", Salary=" + salary + "]";
    }


    public static void main(String[] args) {

        EmployeeDTO emp1 = new EmployeeDTO("Lionel", "Messi", "E123", "lm10@google.com", 75000.00, "123-45-6789", "1234567890");
        EmployeeDTO emp2 = new EmployeeDTO("Cristiano", "Ronaldo", "E124", "cr7@example.com", 80000.00, "987-65-4321", "0987654321");

        System.out.println(emp1);
        System.out.println("Masked SSN: " + emp1.getMaskedSocialSecurityNumber());
        System.out.println("Masked Phone: " + emp1.getMaskedPhoneNumber());

        System.out.println(emp2);
        System.out.println("Masked SSN: " + emp2.getMaskedSocialSecurityNumber());
        System.out.println("Masked Phone: " + emp2.getMaskedPhoneNumber());


        System.out.println("Total number of employees created: " + EmployeeDTO.getEmployeeCount());
    }
}
