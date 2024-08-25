package Interfaces;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=scanner.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array :");
         for (int i=0;i<size;i++){
             arr[i]=scanner.nextInt();
         }
        System.out.println("Select Sorting method :");
        System.out.println("1----> Insertion Sort");
        System.out.println("2----> Merge Sort");
        System.out.println("3----> Bubble Sort");
        int method=scanner.nextInt();
        switch (method){
            case 1:
                InsertionSort is=new InsertionSort();
                is.sort(arr);
                System.out.println("Array after insertion sort : "+Arrays.toString(arr));
                break;
            case 2:
                MergeSort ms=new MergeSort();
                ms.sort(arr);
                System.out.println("Array after merge sort : "+Arrays.toString(arr));
                break;
            case 3:
                BubbleSort bs=new BubbleSort();
                bs.sort(arr);
                System.out.println("Array after bubble sort : "+Arrays.toString(arr));
                break;
            default:
                System.out.println("Please select sorting method from the list");
                break;

        }


    }
}
