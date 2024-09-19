package MethodOverriding;

public class EmployeeMainClass {
    public static void main(String[] args){
        Employee employee=new Employee("Ronaldo",7);
        Employee hourBasedEmployee=new HourlyBasedEmployee("Messi",10,11,1000);
        Employee salariedEmployee=new SalariedEmployee("Neymar",11,2000);
        System.out.println(employee.getEmployeeDetails());
        System.out.println(hourBasedEmployee.getEmployeeDetails());
        System.out.println(salariedEmployee.getEmployeeDetails());
    }
}
