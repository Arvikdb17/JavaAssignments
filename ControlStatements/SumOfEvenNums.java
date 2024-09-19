package ControlStatements;

import java.util.Scanner;

public class SumOfEvenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sumOfEvenNumbers = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] % 2 != 0) {
                continue; // Skip odd numbers
            }
            sumOfEvenNumbers += array[i];
        }

        System.out.println("The sum of even numbers in the array is: " + sumOfEvenNumbers);

        scanner.close();
    }
}
