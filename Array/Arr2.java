package Array;

import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = 4;
        int col = 5;
        int[][] a = new int[row][col];
        int i;
        int j;

        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                a[i][j] = in.nextInt();
            }
        }
        
        System.out.println("Two D array is: ");

        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(a[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}