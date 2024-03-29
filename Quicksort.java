
// Quick sorting method

import java.util.*;

public class Quicksort{

    int partition(int []a,int low ,int high){
        int p,i,j,temp;
         p = a[low];
         i = low + 1;
         j = high;
         while(low < high){
            while( (a[i] < p) && (i < high))
                i++;
            while(a[j] > p)
                j--;
            if(i < j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            else{
                temp = a[low];
                a[low] = a[j];
                a[j] = temp;
                return j;
            }
         }
         return j;
    }

    void sort(int []a, int low, int high){
        if(low < high){
            int s = partition(a,low,high);
            sort(a,low,s-1);
            sort(a,s+1,high);
        }
    }

    public static void main(String[] args) {
        Quicksort m = new Quicksort();
        int a[] = new int[100];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = in.nextInt();
        Random generator = new Random();
        for(int i=0;i<n;i++){
            a[i] = generator.nextInt(20);
        }
        System.out.println("Array before sorting: ");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
        long StartTime = System.nanoTime();
        m.sort(a,0,n-1);
        long StopTime = System.nanoTime();
        long elapseTime = (StopTime - StartTime);
        System.out.println("Array after sorting");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("The time taken to sort array "+elapseTime+" nanosecond's");
    }
}

