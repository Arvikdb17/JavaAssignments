package Basics;

import java.util.Scanner;

public class AverageWeight {
    public static void main(String[] args){
        //Write a program that calculates the average weight of 10 people. Use descriptive and meaningful variable names following Java naming conventions. Use proper datatypes for the variables.
        int numberOfPeople=10;
        double totalWeight=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=1;i<=numberOfPeople;i++){
            System.out.println("Enter weight of "+i+" person");
            totalWeight+=scanner.nextDouble();
        }
        System.out.println("Average Weight= "+totalWeight/numberOfPeople);
        scanner.close();
    }
}
