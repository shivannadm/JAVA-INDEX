package Array;

import java.util.Scanner;

public class Arr{
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int a[] = new int[10];

            for(int i=0;i<a.length;i++){
                a[i] = input.nextInt();
            }
            
            System.out.println("how the output looks Like!");

            for(int i=0;i<a.length;i++){
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
    }
}