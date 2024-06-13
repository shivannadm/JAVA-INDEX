package Array;
import java.util.*;

public class TwoDimensionArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int[][] arr = new int[3][3];
    
    for(int row=0;row<arr.length;row++){
        for(int col = 0;col<arr[row].length;col++){
            arr[row][col] = input.nextInt();
        }
    }

    System.out.println();

    for(int row=0;row<arr.length;row++){
        for(int col = 0;col<arr[row].length;col++){
            System.out.print(arr[row][col]+" ");
        }

        System.out.println();
    }

    for (int[] n :arr){
        System.out.println(Arrays.toString(n));
    }
    }
    
}


