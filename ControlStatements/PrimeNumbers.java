package ControlStatements;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 30 are:");

        for (int num = 2; num <= 30; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        int count=0;
        for (int i = 2; i <=number; i++) {
            if (number % i == 0) {
                count++;
                if(count>2)
                    return false;
            }
        }
        return true;
    }
}
