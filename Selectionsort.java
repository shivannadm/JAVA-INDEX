
//Selection sort using java

import java.util.Scanner;
import java.util.Random;

public class Selectionsort {
    void selectionsort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallnumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallnumber;

        }
    }

    public static void main(String[] args) {
        int i;
        Selectionsort s = new Selectionsort();
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        Random generator = new Random();
        for (i = 0; i < n; i++) {
            arr[i] = generator.nextInt(20);
        }
        System.out.println("Array before sorting: ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        long StartTime = System.nanoTime();
        s.selectionsort(arr, n);
        long StopTime = System.nanoTime();
        long elapseTime = (StopTime - StartTime);
        System.out.println("Array after sorting: ");
        for (i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Time taken to sort array " + elapseTime + " nanoseconds");

    }
}

