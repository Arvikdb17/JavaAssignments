package ControlStatements;

import java.util.Scanner;

public class SecondOccurence {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of elements in a array");
        int size=scanner.nextInt();
        int[] array=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+" of element in the array");
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter number to be checked");
        int number=scanner.nextInt();
        int index=findSecondOccurrence(array,number);
        if(index>0)
            System.out.println("Second Occurrence is in index "+index);
        else
            System.out.println("No Second Occurrence ");
    }

    private static int findSecondOccurrence(int[] array, int number) {
        int count=0;
        for (int i=0;i<array.length;i++){
            if(array[i]==number)
                count++;
            if(count==2)
                return i;
        }
        return 0;
    }
}
