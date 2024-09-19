package StaticBlocks;

public class MathOperations {
    static double number1;
    static double number2;

    static {
        number1 = 10.5;
        number2 = 5.5;
    }

    public static double add() {
        return number1 + number2;
    }

    public static double subtract() {
        return number1 - number2;
    }

    public static double multiply() {
        return number1 * number2;
    }

    public static double divide() {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        // Perform and display math operations
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Division: " + divide());
    }

}
