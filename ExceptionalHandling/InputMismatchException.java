package ExceptionalHandling;

import java.util.Scanner;

public class InputMismatchException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mobile number: ");
        String mobileNumber = sc.next();
        try {
            long mobile = Long.parseLong(mobileNumber);
            System.out.println("Mobile number is :"+mobile);
        } catch (NumberFormatException e) {
            System.out.println("InputMismatch Exception\nPlease give a valid mobile number!");
        }

    }
}
