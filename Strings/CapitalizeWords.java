package Strings;

import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String capitalizedSentence = capitalizeFirstLetters(inputSentence);

        System.out.println("Capitalized sentence: " + capitalizedSentence);

        scanner.close();
    }

    public static String capitalizeFirstLetters(String sentence) {
        String[] words = sentence.split(" ");

        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                // Capitalize the first letter and append the rest of the word
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalizedSentence.toString().trim();
    }
}
