package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no of people : ");
        int n=scanner.nextInt();

        int[][] array=new int[n][1];

        System.out.println("Enter the current weight of yours : ");
        for(int i=0;i<n;i++){
            array[i][0]=scanner.nextInt();
        }
        System.out.println("Your Current minimum weights : ");
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(array[i]));
        }
        boolean flag=true;
        while(flag){
            System.out.println("Enter the id of yours : " + " or if don't want to change your weight -1 to exit");
            int id=scanner.nextInt();
            if(id==-1){
                break;
            }
            System.out.println("Enter your current weight");
            int currentWeight=scanner.nextInt();
            addWeight(array,id-1,currentWeight);
            System.out.println("Minimum of your weight : "+minimumOfWeight(array[id-1]));
            scanner.nextLine();
            scanner.nextLine();
            System.out.println("Do you want to see you weights y/n : ");
            String yesOrNo=scanner.nextLine();
            if(yesOrNo.equals("y")){
                printArrayOfWeight(array,id-1);
            }
        }
    }

    private static void printArrayOfWeight(int[][] arr,int id) {
        System.out.println(Arrays.toString(arr[id]));
    }

    private static int minimumOfWeight(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }

    private static void addWeight(int[][] array, int id,int weight) {
        int[] changedArray=Arrays.copyOf(array[id],array[id].length+1);
        changedArray[changedArray.length-1]=weight;
        array[id]=changedArray;
    }
}
