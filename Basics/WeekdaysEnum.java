package Basics;

import java.util.Scanner;

public class WeekdaysEnum {
    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7) to get the weekday:");
        int dayNumber = scanner.nextInt();
        switch (dayNumber) {
            case 1:
                System.out.println("The day is " + Weekday.MONDAY.ordinal());
                break;
            case 2:
                System.out.println("The day is " + Weekday.TUESDAY);
                break;
            case 3:
                System.out.println("The day is " + Weekday.WEDNESDAY);
                break;
            case 4:
                System.out.println("The day is " + Weekday.THURSDAY);
                break;
            case 5:
                System.out.println("The day is " + Weekday.FRIDAY);
                break;
            case 6:
                System.out.println("The day is " + Weekday.SATURDAY);
                break;
            case 7:
                System.out.println("The day is " + Weekday.SUNDAY);
                break;
            default:
                System.out.println("Invalid number!");
        }
        scanner.close();
    }
}
