package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String :");
        String string=scanner.nextLine();
        System.out.println(reverseWords(string));
        scanner.close();
    }
    private static String reverseWords(String s1) {

        if(s1.isEmpty())
            return s1;
        int spaceIndex=s1.indexOf(" ");
        if(spaceIndex==-1)
            return s1;
        String firstWord=s1.substring(0, spaceIndex);

        return reverseWords(s1.substring(spaceIndex+1))+" "+firstWord;
    }
}
