package AbstractClasses;

import java.util.Scanner;

public abstract class Employee {
    private String name;
    private int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public abstract double calculatePay();
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of the Employee :");
        String name=scanner.next();
        System.out.println("Enter ID of the Employee :");
        int id=scanner.nextInt();
        System.out.println("Select the type of Employee :");
        System.out.println("1------------>Hourly Employee");
        System.out.println("2------------>Salaried Employee");
        int type=scanner.nextInt();
        Employee employee;
        if(type==1){
            System.out.println("Enter hours Worked :");
            int hoursWorked=scanner.nextInt();
            System.out.println("Enter hourly pay :");
            double hourlyPay=scanner.nextDouble();
            employee=new HourlyEmployee(name,id,hoursWorked,hourlyPay);
            System.out.println("Salary  :"+employee.calculatePay());
        } else if (type==2) {
            System.out.println("Enter annual pay :");
            double annualPay=scanner.nextDouble();
            employee=new SalariedEmployee(name,id,annualPay);
            System.out.println("Salary  :"+employee.calculatePay());
        }
        else
            System.out.println("Invalid Employee type");

        scanner.close();


    }
}
class HourlyEmployee extends Employee{
    private int hoursWorked;
    private double hourlyPay;
    HourlyEmployee(String name,int id,int hoursWorked,double hourlyPay){
        super(name, id);
        this.hoursWorked=hoursWorked;
        this.hourlyPay=hourlyPay;
    }

    @Override
    public double calculatePay() {
        return hourlyPay*hoursWorked;
    }
}
class SalariedEmployee extends Employee{
    private double annualSalary;
    SalariedEmployee(String name,int id,double annualSalary){
        super(name, id);
        this.annualSalary=annualSalary;
    }
    public double calculatePay(){
        return annualSalary/12;
    }
}
