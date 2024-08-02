package Inheritance;

public class Vehicle {
    String type;
    double price;
    String colour;
    int numberOfWheels;
    Vehicle(String type,double price,String colour,int numberOfWheels){
        this.type=type;
        this.price=price;
        this.colour=colour;
        this.numberOfWheels=numberOfWheels;
    }
    public void displayDetails(){
        System.out.println("Vehicle type :"+type+" Price :"+price+" Colour :"+colour+" No. of Wheels :"+numberOfWheels);
    }
    public static void main(String[] args){
        Vehicle vehicle=new Bike(200000,"Blue","DirtBike");
        vehicle.displayDetails();
        vehicle=new Car(1500000,"Black",6);
        vehicle.displayDetails();
        vehicle=new Bus(2000000,"Green",56);
        vehicle.displayDetails();
    }
}
class Bike extends Vehicle{
    String model;
    Bike(double price,String colour,String model){
        super("Bike",price,colour,2);
        this.model=model;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Model is "+model);
    }

}
class Car extends Vehicle{
  int numberOfAirBags;
    Car(double price,String colour,int numberofAirBags){
        super("Car",price,colour,4);
        this.numberOfAirBags=numberofAirBags;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Total no. of Airbags :"+numberOfAirBags);
    }
}
class Bus extends Vehicle{
  int noOfSeats;
    Bus(double price,String colour,int noOfSeats){
        super("Bus",price,colour,6);
        this.noOfSeats=noOfSeats;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Total no. of seats :"+noOfSeats);
    }
}
