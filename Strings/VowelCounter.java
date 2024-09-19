package Strings;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Number of vowels: " + countVowels(inputString));

        scanner.close();
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}
