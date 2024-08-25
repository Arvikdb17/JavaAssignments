package ExceptionalHandling;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator: ");
        long numerator = sc.nextInt();
        System.out.println("Enter Denominator: ");
        int denominator = sc.nextInt();

        if(System.out.printf("Hello World")!=null) {

        }
        try {
            System.out.println("Divition of two Numbers is : " + numerator / denominator);
            System.out.println("Remainder of two Numbers is : " + numerator % denominator);
        } catch (ArithmeticException e) {
            System.out.println("Please use Denominator as Non Zero number");
        } finally {
            sc.close();
        }

    }
}
