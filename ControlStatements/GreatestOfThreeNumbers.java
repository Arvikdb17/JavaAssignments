package ControlStatements;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        //Take three numbers from the user and print the greatest number.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st value :");
        int a = scanner.nextInt();
        System.out.println("Enter 2nd value :");
        int b = scanner.nextInt();
        System.out.println("Enter 3rd value :");
        int c = scanner.nextInt();

        if (a > b && a > c)
            System.out.println("Greatest number is a");
        else if (b > c)
            System.out.println("Greates number is b");
        else
            System.out.println("Greatest number is c");
    }
}
