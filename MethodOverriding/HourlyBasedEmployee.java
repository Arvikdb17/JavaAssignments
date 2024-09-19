package MethodOverriding;

public class HourlyBasedEmployee extends Employee{
    int hoursWorked;
    double wagePerHour;
    HourlyBasedEmployee(String name, int id,int hoursWorked,double wagePerHour) {
        super(name, id);
        this.hoursWorked=hoursWorked;
        this.wagePerHour=wagePerHour;
    }

    public String getEmployeeDetails(){
        return super.getEmployeeDetails()+" Hours Worked : "+hoursWorked+" Wage Per Hour : "+wagePerHour;
    }
    /*@Override
    void getEmployeeDetails() {
        super.getEmployeeDetails();

    }*/
}
