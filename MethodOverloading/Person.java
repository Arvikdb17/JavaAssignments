package MethodOverloading;

public class Person {
    String name;
    int age;
    String address;

    Person(String name){
        this.name=name;
        System.out.println("This Constructor has only Name");
    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("This Constructor has name and age");
    }
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
        System.out.println("This Constructor has Name, age and address");
    }
}
