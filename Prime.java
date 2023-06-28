// Finding Prime number in java using if else conditions

import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double i,m=0,flag=0;
        System.out.println("Enter the number: ");
        double n = in.nextDouble();
        m = n/2;
        if(n==0||n==1)
        {
            System.out.println(n+"It's not a prime number ");
        }
        else
        {
            for(i=2;i<m;i++)
            {
                if(n%i==0)
                {
                    System.out.println("Not prime");
                    flag=1;
                    break;
                }
            }
            
        }
        if(flag==0)
        {
            System.out.println(n+"Is prime");       
        }
    }
}

