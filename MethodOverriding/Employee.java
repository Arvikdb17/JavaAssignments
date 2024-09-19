package MethodOverriding;

public class Employee {

    String name;
    int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getEmployeeDetails(){
        return "Name : "+name+" id : "+id;
    }
}
