package ScopesOperators;
import java.util.Scanner;
public class BitwiseOperators {
    public static void main(String[] args) {
       // Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int andResult = number1 & number2;
        int orResult = number1 | number2;
        int xorResult = number1 ^ number2;

        int leftShiftNumber1 = number1 << 1;
        int rightShiftNumber1 = number1 >> 1;
        int leftShiftNumber2 = number2 << 1;
        int rightShiftNumber2 = number2 >> 1;

        System.out.println("Bitwise AND of " + number1 + " and " + number2 + " is: " + andResult);
        System.out.println("Bitwise OR of " + number1 + " and " + number2 + " is: " + orResult);
        System.out.println("Bitwise XOR of " + number1 + " and " + number2 + " is: " + xorResult);
        System.out.println("Left shift of " + number1 + " by 1 position is: " + leftShiftNumber1);
        System.out.println("Right shift of " + number1 + " by 1 position is: " + rightShiftNumber1);
        System.out.println("Left shift of " + number2 + " by 1 position is: " + leftShiftNumber2);
        System.out.println("Right shift of " + number2 + " by 1 position is: " + rightShiftNumber2);

        scanner.close();
    }
}
