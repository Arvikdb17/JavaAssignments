package ControlStatements;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create a program that takes a student's score as input and outputs their corresponding grade.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else if (score >= 60 && score < 70) {
            grade = 'D';
        } else if (score >= 0 && score < 60) {
            grade = 'F';
        } else {
            System.out.println("Invalid score entered.");
            scanner.close();
            return;
        }
        System.out.println("The student's grade is: " + grade);
        scanner.close();
    }
}
