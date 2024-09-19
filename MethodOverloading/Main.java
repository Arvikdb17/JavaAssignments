package MethodOverloading;

public class Main {
    public static void main(String[] args){
        Person p1=new Person("Zoho");
        System.out.println(p1.name);
        Person p2=new Person("Zoho",26);
        System.out.println(p2.age);
        Person p3=new Person("Zoho",26,"Guduvancheri");
        System.out.println(p3.address);
    }
}
