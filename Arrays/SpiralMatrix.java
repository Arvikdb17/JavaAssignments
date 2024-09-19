package Arrays;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no. of Rows :");
        int n=scanner.nextInt();
        int top=0,bottom=n-1,left=0,right=n-1;

        int[][] matrix = new int[n][n];

        int value = 1;


        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = value++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = value++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
