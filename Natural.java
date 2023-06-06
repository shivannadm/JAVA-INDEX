// Sum Natural number's

import java.util.Scanner;

public class Natural{
    public static void main(String[] args) {
        int n ,i ,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the natural number: ");
        n = in.nextInt();
        for(i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        System.out.println("Sum is including "+n+": "+sum);
    }
}
