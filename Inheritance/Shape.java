package Inheritance;


public abstract class Shape {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void displayDetails(){
        System.out.println("Area :"+calculateArea());
        System.out.println("Perimeter :"+calculatePerimeter());
    }
    public static void main(String[] args){
        Shape shape=new Circle(4.5);
        shape.displayDetails();

        shape=new Rectangle(4,6);
        shape.displayDetails();

    }

}

class Rectangle extends Shape{
    double length;
    double breadth;
    Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public double calculateArea(){
        return length*breadth;
    }
    public double calculatePerimeter() {
       return 2*(length+breadth);
    }
    public void displayDetails(){
        System.out.println("The shape is Rectangle");
        super.displayDetails();
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
    public void displayDetails(){
        System.out.println("This is Circle");
        super.displayDetails();
    }

}
