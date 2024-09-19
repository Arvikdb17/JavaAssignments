package MethodOverriding;

public class SalariedEmployee extends Employee {
    double annualSalary;
    SalariedEmployee(String name,int id,double annualSalary){
        super(name,id);
        this.annualSalary=annualSalary;
    }
    public String getEmployeeDetails(){
       return super.getEmployeeDetails()+ "Annual Salary : "+annualSalary;
    }
}
