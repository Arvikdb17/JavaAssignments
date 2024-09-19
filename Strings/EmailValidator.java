package Strings;

import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scanner.nextLine();

        boolean isValid = validateEmail(email);

        if (isValid) {
            System.out.println("The email address is valid.");
        } else {
            System.out.println("The email address is invalid.");
        }

        scanner.close();
    }

    public static boolean validateEmail(String email) {
        // Check if the email contains an '@' symbol
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return false;
        }

        // Check if there is only one '@' symbol
        if (email.indexOf('@', atIndex + 1) != -1) {
            return false;
        }

        // Check if there is a domain part after the '@' symbol
        String domain = email.substring(atIndex + 1);
        if (domain.length() < 3) { // Minimum length for a domain (e.g., a.b)
            return false;
        }

        // Check if the domain contains a dot
        int dotIndex = domain.indexOf('.');
        if (dotIndex == -1) {
            return false;
        }

        // Ensure that the dot is not the first or last character in the domain
        if (dotIndex == 0 || dotIndex == domain.length() - 1) {
            return false;
        }

        // Check if there are characters before and after the dot in the domain
        String domainName = domain.substring(0, dotIndex);
        String domainExtension = domain.substring(dotIndex + 1);
        if (domainName.isEmpty() || domainExtension.isEmpty()) {
            return false;
        }

        return true;
    }
}
