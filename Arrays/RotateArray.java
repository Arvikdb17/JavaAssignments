package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size=scanner.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the elements of array :");
        for (int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter degree of rotation :");
        int noOfRotation=scanner.nextInt();
        while (noOfRotation>0){
            int lastelement=array[array.length-1];
            for(int i=array.length-1;i>0;i--){
                array[i]=array[i-1];
            }
            array[0]=lastelement;
            noOfRotation--;
        }
        System.out.println(Arrays.toString(array));
    }
}
