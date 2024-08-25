package ExceptionalHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws ageOutOfBoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please sign-up your account: ");
        System.out.println("Enter your name: ");
        String name = sc.next();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18)
                throw new ageOutOfBoundException("Age must me above 18 to Sign-up");
        } catch (ageOutOfBoundException e) {
            System.out.println("Age must be above 18 to Sign-up");
            return;
        }
        System.out.println("Enter your email: ");
        String email = sc.next();

        System.out.println("Enter your password: ");
        String password = sc.next();
        System.out.println("**********************************");
        System.out.println("Successfully Signed Up\nname: " + name + "\n"
                + "age: " + age + "\n"
                + "email: " + email);
        System.out.println("**********************************");
    }
}

class ageOutOfBoundException extends Exception {
    ageOutOfBoundException(String message) {
        super(message);
    }
}
