package Strings;

import java.util.Scanner;

public class ReverseCharacters {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string");
        String string1=scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder(string1);
        string1=stringBuilder.reverse().toString();
        System.out.println("Reversed String :"+string1);
        scanner.close();


    }
}
