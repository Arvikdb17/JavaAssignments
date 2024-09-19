package ScopesOperators;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        //Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct: "+ root1+" "+ root2);
        }
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is real and repeated: "+ root);
        }
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex and distinct:"+
                    realPart+ imaginaryPart+ realPart+ imaginaryPart);
        }
        scanner.close();
    }
}
